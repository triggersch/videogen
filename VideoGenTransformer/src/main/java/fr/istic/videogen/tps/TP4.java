package fr.istic.videogen.tps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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

public class TP4 {
	
	private FilesUtils fileservice = new FilesUtils();
	
	private File csvfile = fileservice.loadingFile2("csv/csv-file.csv");
	
	public int numberOfVariants( VideoGeneratorModel videoGen ){
		
		int res = 1;
		
		for (Media media : videoGen.getMedias()) {
			
			if (media instanceof OptionalMedia){
				res = res * 2;
			}else if (media instanceof AlternativesMedia){
				AlternativesMedia alternative = (AlternativesMedia)media;
				EList<MediaDescription> liste = alternative.getMedias();
				if (liste.size() > 0 ) {
					res = res * liste.size();
				}
			}
		}
		return res;
	}
	
	
	public int numberOfVariantFiles( File file) {
		int res = 0;
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String line;
			 
			while ((line = buffer.readLine()) != null) {
				res += 1;
			}
			buffer.close();
		}catch (Exception e) {
			e.printStackTrace();
		}		
		return res-1; // on retire les entetes
	}
	
	
	@Test
	public void testNombreLignes() {
		
		File dslfile = fileservice.loadingFile2("dsl/exampletp.videogen");
		VideoGeneratorModel videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI(dslfile.getPath()));
		assertNotNull(videoGen);
		System.out.println( "Nb of variants : " + numberOfVariants(videoGen) );
		System.out.println("Nb of line in csv file : " + numberOfVariantFiles(csvfile));
		assertEquals(numberOfVariants(videoGen),numberOfVariantFiles(csvfile));
	}

}
