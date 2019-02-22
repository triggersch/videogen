package fr.istic.videogen.tps;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.junit.Ignore;
import org.junit.Test;

import fr.istic.videoGen.AlternativesMedia;
import fr.istic.videoGen.ImageDescription;
import fr.istic.videoGen.MandatoryMedia;
import fr.istic.videoGen.Media;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.OptionalMedia;
import fr.istic.videoGen.VideoDescription;
import fr.istic.videoGen.VideoGeneratorModel;
import fr.istic.videogen.fileutils.FilesUtils;

public class TP2 {
	
	
	private FilesUtils fileservice = new FilesUtils();
	
	public void readPlayList(File playlist) throws IOException, InterruptedException {
		
		Runtime run = Runtime.getRuntime();
		Process p = run.exec("vlc " + playlist);
		p.waitFor();	
	}
	

	public void readVideo(String videoPath) throws IOException, InterruptedException {
		
		Runtime run = Runtime.getRuntime();
		Process p = run.exec("vlc " + videoPath);
		p.waitFor();	
	}
	
	
	
	
	public float videoLength( String videofilename ) throws IOException, InterruptedException {
        
		
		String command ="ffprobe -v error -show_entries format=duration -of default=noprint_wrappers=1:nokey=1 " + videofilename;
		String[] list = command.split(" ");
		
		ProcessBuilder pb = new ProcessBuilder(list);
		File wrkDir = fileservice.loadingFile2("");
		pb.directory(wrkDir);
		
		Process proc = pb.start();
		BufferedReader output = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		String ligne = output.readLine();	
		proc.waitFor();
		
		float length = 0;
		if (ligne != null && ligne != "")
			length = new Float(ligne).floatValue();
		
		return length;
	}
	
	public float longestVariante(VideoGeneratorModel videoGen ) throws IOException, InterruptedException {
		
		float f = 0;

		for (Media m : videoGen.getMedias()) {
			
			if (m instanceof MandatoryMedia){
				MandatoryMedia mand = (MandatoryMedia)m;
				MediaDescription md = mand.getDescription();
				f += videoLength( md.getLocation());		// Obligatoire
				
			}else if (m instanceof OptionalMedia){
				OptionalMedia option = (OptionalMedia)m;
				MediaDescription md = option.getDescription();
				f += videoLength( md.getLocation());
				
			}else if (m instanceof AlternativesMedia){
				AlternativesMedia alter = (AlternativesMedia)m;
				EList<MediaDescription> liste = alter.getMedias();
				List<Float> listDuration = new ArrayList<Float>();
				
				for( MediaDescription md : liste ) {
					if(md instanceof ImageDescription) {
//						ImageDescription img = (ImageDescription)md;			
					}else if(md instanceof VideoDescription) {
						VideoDescription video = (VideoDescription)md;
						listDuration.add(new Float(videoLength( video.getLocation())));
					}
				}
				f += listDuration.stream().reduce(Float::max).get().floatValue();
			}
		}
		return f;
	}
	
	public int randomInt(int possibilities) {
		
		Random random = new Random();
		int nb = random.nextInt();
		if (nb<0) nb = (nb * -1);
		return nb  % possibilities;
	}
	
	public File generatePlaylist(VideoGeneratorModel videoGen ) throws IOException {
		
		File f = fileservice.loadingFile2("playlists/playlist.m3u");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));

		for (Media m : videoGen.getMedias()) {
			
			if (m instanceof MandatoryMedia){
				MandatoryMedia mand = (MandatoryMedia)m;
				MediaDescription md = mand.getDescription();
				bw.write( md.getLocation() + "\n");		// Obligatoire
				
			}else if (m instanceof OptionalMedia){
				OptionalMedia option = (OptionalMedia)m;
				MediaDescription md = option.getDescription();
				
				if (randomInt(2) == 0)			
					bw.write( md.getLocation() + "\n");
				
			}else if (m instanceof AlternativesMedia){
				AlternativesMedia alter = (AlternativesMedia)m;
				EList<MediaDescription> liste = alter.getMedias();
				int nb = randomInt(liste.size());
				assertTrue("Alternatives random correct : ", (nb>=0 && nb < liste.size()));
				bw.write(liste.get(nb).getLocation() + "\n");
			}
		}
		bw.close();
		return f;
	}
	
	
	public String videoToThumbnail(String videofilename) throws InterruptedException, IOException {
		
		String image = "pictures/" + videofilename.split("\\.")[0] + ".png";
		
		String commande = "ffmpeg -y -i videos/"+ videofilename + " -ss 00:00:02 -vframes 1 " + image ;
		String[] list = commande.split(" ");
		
		ProcessBuilder pb = new ProcessBuilder(list);
		File wrkDir = fileservice.loadingFile2("");
		System.out.println(wrkDir.getAbsolutePath());
		pb.directory(wrkDir);
		
		Process p = pb.start();
		BufferedReader in = new BufferedReader(new InputStreamReader(p.getErrorStream()));
		String line;
		while ((line = in.readLine()) != null) {
		    System.out.println(line);
		}
		//System.out.println(image.split("\\.")[0]);
		
		p.waitFor();
		
		return image;
	}
	

	@Ignore
	public void readVideoSeq() throws Exception {
		
		File dslfile = fileservice.loadingFile2("dsl/exampletp.videogen");
		VideoGeneratorModel videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI(dslfile.getPath()));
		assertNotNull(videoGen);
		
	
		for (Media media : videoGen.getMedias()) {
			
			if (media instanceof MandatoryMedia){
				
				MandatoryMedia mandatory = (MandatoryMedia)media;
				MediaDescription mediadescription = mandatory.getDescription();
				readVideo(mediadescription.getLocation());		
				
			}else if (media instanceof OptionalMedia){
				
				OptionalMedia optional = (OptionalMedia)media;
				MediaDescription mediadescription = optional.getDescription();
				
				if (randomInt(2) == 0)			
					readVideo(mediadescription.getLocation());
				
			}else if (media instanceof AlternativesMedia){
				
				AlternativesMedia alternative = (AlternativesMedia)media;
				EList<MediaDescription> liste = alternative.getMedias();
				int number = randomInt(liste.size());
				assertTrue("Alternatives random correct : ", (number>=0 & number < liste.size()));
				readVideo(liste.get(number).getLocation());
			}
		}
	}
	
	
	@Test
	public void testVideoLength() throws IOException, InterruptedException {
		
		float length = videoLength("videos/v100c.mp4");
		assertTrue(length > 0);
	}
	
	@Test
	public void testVideoToThumbnail() throws IOException, InterruptedException {
		
		String image = videoToThumbnail("v100c.mp4");
		System.out.println( "generated Image : " + image );
		assertFalse(image == "");
	}
	
	
	@Test
	public void testPlaylist() throws IOException, InterruptedException {
		
		File dslfile = fileservice.loadingFile2("dsl/exampletp.videogen");
		
		VideoGeneratorModel videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI(dslfile.getPath()));
		assertNotNull(videoGen);
		File file = generatePlaylist(videoGen);
		assertNotNull(file);
		readPlayList( file );
		
	}
	
	@Test
	public void testLongestVariante() throws IOException, InterruptedException {
		
		File dslfile = fileservice.loadingFile2("dsl/exampletp.videogen");
		
		VideoGeneratorModel videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI(dslfile.getPath()));
		assertNotNull(videoGen);
		System.out.println( "longest video: " + longestVariante(videoGen));	
	}

}
