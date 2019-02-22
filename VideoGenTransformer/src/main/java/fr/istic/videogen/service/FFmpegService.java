package fr.istic.videogen.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.io.FileUtils;

import fr.istic.videogen.fileutils.FilesUtils;

public class FFmpegService {
	
	private static FilesUtils fileUtils = new FilesUtils();
	private static String sep = File.separator;
	
	
	public static void concatVideo(File listfile, File out) throws IOException{
		
		File wrkDir = fileUtils.loadingFile("videos/");
		File playlist = new File(wrkDir.getAbsoluteFile() + sep + listfile.getName());
		
		FileUtils.copyFile(listfile, playlist);
	
		String command = "ffmpeg -y -f concat -i "+ listfile.getName()+  " -c copy "+  out.getName();
		
		String[] list = command.split(" ");
		ProcessBuilder pb = new ProcessBuilder(list);
		
		startProc(pb, wrkDir);
		playlist.delete();
		if (out.exists()) out.delete();
		FileUtils.moveFile(new File(wrkDir.getAbsoluteFile() + sep + out.getName()), out);
	}
	
	public static void addTextToVideo(File input, String text){
		
		File outwithtext = new File( new FilesUtils().loadingFile("videos").getAbsoluteFile() + "/outwithtext.mp4");  ;
		if (outwithtext.exists()) outwithtext.delete();
		
		String[] list = {"ffmpeg", "-i","videos"+sep+ input.getName(), "-vf","drawtext=fontfile=fonts/font.ttf: text='"+text+"':"
				+ " fontcolor=white: fontsize=40: box=1: boxcolor=black@0.5: boxborderw=5: x=(w-text_w)/2:"
				+ " y=(h-text_h)/2", "-codec:a",  "copy", "videos"+sep+"outwithtext.mp4" };
		
		ProcessBuilder pb = new ProcessBuilder(list);
		File wrkDir = fileUtils.loadingFile("");
		startProc(pb, wrkDir);
	}
	
	public static void videoToThumbnail(File video){
		
		String imagefilename = "pictures/" + video.getName().split("\\.")[0] + ".png";
		String commande = "ffmpeg -y -i videos/"+ video.getName() + " -ss 00:00:02 -vframes 1 " + imagefilename ;
		String[] list = commande.split(" ");
		
		ProcessBuilder pb = new ProcessBuilder(list);
		File wrkDir = fileUtils.loadingFile("");
		startProc(pb, wrkDir);
	}
	
	private static void startProc(ProcessBuilder pb, File wrkd) {
		
		pb.directory(wrkd);
		try {
			Process p = pb.start();
			System.out.println(getError(p));
			p.waitFor();
			//System.out.println(getError(p));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	private static String getError(Process process) throws IOException{

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
