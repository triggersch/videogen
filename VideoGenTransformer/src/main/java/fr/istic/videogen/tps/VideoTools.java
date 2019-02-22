package fr.istic.videogen.tps;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import fr.istic.videogen.fileutils.FilesUtils;

public class VideoTools {
	
	private static FilesUtils fileservice = new FilesUtils();
	
	public static String videoToImage(String videoPath) throws InterruptedException, IOException {
		String newImage = "thumbnail/" + videoPath + ".png";
		Runtime run = Runtime.getRuntime();
		Process p = run.exec("ffmpeg -y -i "+ videoPath + " -r 1 -t 00:00:01 -ss 00:00:02 -f image2 "+ "src/main/webapp/public/" + newImage );
		p.waitFor();
		return newImage;
	}

	

	public static void concatenerMedia(List<String> listeMedia , String output) throws IOException, InterruptedException {
		

		String commande = "ffmpeg -y -f concat -i playlists/playlist.txt -c copy " + output;
		String[] list = commande.split(" ");
		
		ProcessBuilder pb = new ProcessBuilder(list);
		File wrkDir = fileservice.loadingFile("");
		pb.directory(wrkDir);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter( wrkDir.getPath()+ "/playlists/playlist.txt"));
		for (String path:listeMedia) {
			bw.write("file \'" + path  + "\'\n");
		}
		bw.close();
		Process p = pb.start();
		p.waitFor();
		
		getError(p);
	}
	
	
	public static void convertMediaToGIF(String m1, String output, int fps, String scale) throws IOException, InterruptedException {
		
		Runtime run = Runtime.getRuntime();
		
	
		Process p = run.exec("ffmpeg -y -i "+ m1 +" -pix_fmt rgb24 -r "+ fps +" -s "+scale+" -f gif " + output);
	
		
		p.waitFor();
	}
	
	
	
	public float getVideoDuration( String videoPath ) throws IOException, InterruptedException {
        
		Runtime run = Runtime.getRuntime();
		Process p = run.exec("ffprobe -v error -show_entries format=duration -of default=noprint_wrappers=1:nokey=1 " + videoPath);
		BufferedReader output = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String ligne = output.readLine();		
		p.waitFor();
		
		float nb = 0;
		if (ligne != null && ligne != "")
			nb = new Float(ligne).floatValue();
		
		
		return nb;
	}
	
	public static String getError(Process process) throws IOException{

		BufferedReader reader = 
                new BufferedReader(new InputStreamReader(process.getErrorStream()));
		StringBuilder builder = new StringBuilder();
		String line = null;
		while ( (line = reader.readLine()) != null) {
				builder.append(line);
				builder.append(System.getProperty("line.separator"));
		}
		return  builder.toString();
	}

}
