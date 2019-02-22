package fr.istic.videogen.fileutils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FilesUtils {
	
	private ClassLoader clazz = getClass().getClassLoader();
	
	public File loadingFile(String str){
		File file = FileUtils.getFile(clazz
				  .getResource(str)
				  .getPath());
		return file;
	}
	
	
	public File loadingFile2(String str) {
		return FileUtils.getFile("src","main", "resources", str);
	}
	
	public void writeStringToFile(File file, String msg) {
		try {
			// 3rd parameter boolean append = true
			FileUtils.writeStringToFile(file, msg, Charset.defaultCharset(),true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeListStringToFile(File file, List<String> msgs) {
		
		if (file.exists()) {
			file.delete();
			try {
				FileUtils.touch(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		for (String s : msgs) {
			writeStringToFile(file, s);
		}
	}

}
