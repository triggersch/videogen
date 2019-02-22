package fr.istic.videogen.tps;

import static org.junit.Assert.*;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
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


public class TP3 {
	
	
	private FilesUtils fileservice = new FilesUtils();
	
	public String[] addOptionnalVideo( String[] entries ) {
		
		String[] result = new String[entries.length * 2];
		int index = 0;
		for(String s:entries) {
			result[index] = s + ",TRUE";
			result[index+1] = s + ",FALSE";
			index += 2;
		}
		return result;
	}
	
	public String[] addMandatoryVideo( String[] entries ) {
		
		String[] result = new String[entries.length];
		int index = 0;
		for(String s:entries) {
			if (s == null)
				s="";
			result[index] = s + ",TRUE";
			index ++;
		}
		return result;
	}
	
	
	
	public String[] addAlternativesVideo( String[] entries , int nbChoice) {
		
		String[] result = new String[entries.length * nbChoice];
		int index = 0;
		int i=0;
		for(String s:entries) {
			int nb = nbChoice;
			while(nb > 0) {
				String line = "";
				for(i=0;i<nbChoice;i++) {
					if (i == nb-1)
						line += ",TRUE";
					else
						line += ",FALSE";
				}
				result[index] = s + line;
				index++;
				nb--;
			}
		}
		
		return result;
	}
	
	public Long getFileSize(String filename) {
		File f = fileservice.loadingFile2(filename);
		Long value = 0L;
		if (f.exists()) value = f.length();
		return value;
	}
	
	@Test
	public void generateCSV() throws Exception {
		
		String listeId = "";
		String[] listeCycle = new String[1];
		Map<String,String> listLocation = new LinkedHashMap<String,String>();
		
		File dslfile = fileservice.loadingFile2("dsl/exampletp.videogen");
		
		VideoGeneratorModel videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI(dslfile.getPath()));
		assertNotNull(videoGen);
		
		for (Media media : videoGen.getMedias()) {
			
			if (media instanceof MandatoryMedia){
				MandatoryMedia mandatory = (MandatoryMedia)media;
				MediaDescription mediadescription = mandatory.getDescription();
				
				if(mediadescription instanceof ImageDescription) {
					ImageDescription imagedescription = (ImageDescription)mediadescription;
					System.out.println("Mandatory image : " + imagedescription.getImageid());
					listeId += "," + imagedescription.getImageid();
					listeCycle = addMandatoryVideo( listeCycle );
					listLocation.put( imagedescription.getImageid(),imagedescription.getLocation());

				}else if(mediadescription instanceof VideoDescription) {
					VideoDescription video = (VideoDescription)mediadescription;
					System.out.println("Mandatory video : " + video.getVideoid());
					listeId += "," + video.getVideoid();
					listeCycle = addMandatoryVideo( listeCycle );
					listLocation.put( video.getVideoid(),video.getLocation());
				}
			}else if (media instanceof OptionalMedia){
				OptionalMedia option = (OptionalMedia)media;

				MediaDescription mediadescrip = option.getDescription();
				if(mediadescrip instanceof ImageDescription) {
					ImageDescription imgdescrip = (ImageDescription)mediadescrip;
					System.out.println("Optional image : " + imgdescrip.getImageid());
					listeId += "," + imgdescrip.getLocation();
					listeCycle = addOptionnalVideo( listeCycle );
					listLocation.put( imgdescrip.getImageid(),imgdescrip.getLocation());
					
				}else if(mediadescrip instanceof VideoDescription) {
					VideoDescription videodescription = (VideoDescription)mediadescrip;
					System.out.println("Optional video : " +videodescription.getVideoid());
					listeId += "," + videodescription.getVideoid();
					listeCycle = addOptionnalVideo( listeCycle );
					listLocation.put( videodescription.getVideoid(),videodescription.getLocation());
				}
			}else if (media instanceof AlternativesMedia){
				AlternativesMedia alternative = (AlternativesMedia)media;
				EList<MediaDescription> liste = alternative.getMedias();
				for( MediaDescription md : liste ) {
					if(md instanceof ImageDescription) {
						ImageDescription img = (ImageDescription)md;
						System.out.println("Alternatives image : " + img.getImageid());
						listeId += "," + img.getImageid();
						listLocation.put( img.getImageid(),img.getLocation());
						
					}else if(md instanceof VideoDescription) {
						VideoDescription video = (VideoDescription)md;
						System.out.println("Alternatives video : " +video.getVideoid());
						listeId += "," + video.getVideoid();
						listLocation.put( video.getVideoid(),video.getLocation());
					}
				}
				listeCycle = addAlternativesVideo( listeCycle , liste.size());
			}
		}
		
				
		File file = fileservice.loadingFile2("csv/csv-file.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write(listeId + ",size,realsize \n");
		int index = 1;
		
		String output = "ouputvideo/output.mp4";
		

		
		for (String line : listeCycle) {
			Long cumulSize = 0L;
			Long realSize = 0L;
			Long gifSize = 0L;
			int indexColonne = -1;
			List<String> concatLocation = new ArrayList<String>();
			
			// liste de media à concatener 
			List<String> medias = new ArrayList<String>();
			
			for (String str : line.split(",")) {
				if (str.equals("TRUE")) {
					//size
					Object[] keys = listLocation.keySet().toArray();
					String location = listLocation.get( keys[indexColonne] );
					concatLocation.add(location);
					cumulSize += getFileSize(location);
					//realsize
					medias.add(location);
				}
				indexColonne++;
			}
			VideoTools.concatenerMedia(concatLocation, output);
			realSize = getFileSize(output);
			
			
			bw.write(index + line + "," + cumulSize +","+ realSize +","+ gifSize +"\n");
			index++;
		}
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		 
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();

	
	}

}
