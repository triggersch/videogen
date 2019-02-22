package fr.istic.videogen.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.springframework.stereotype.Service;

import fr.istic.videoGen.AlternativesMedia;
import fr.istic.videoGen.MandatoryMedia;
import fr.istic.videoGen.Media;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.OptionalMedia;
import fr.istic.videoGen.VideoGeneratorModel;
import fr.istic.videogen.dto.Video;

@Service
public class ModelService implements IModelService {

	private int index = 0;

	@Override
	public List<String> modelToPlayList(VideoGeneratorModel videoGen, List<Video> variants) {
		
		List<String> res = new ArrayList<String>();
		List<String> names = getFilenames(variants);
		
		for(Media m : videoGen.getMedias()) {
			
			if (m instanceof MandatoryMedia){
				MandatoryMedia mand = (MandatoryMedia) m;
				MediaDescription md = mand.getDescription();
				res.add("file \'" + md.getLocation()+ "\'\n");
			}
			
			if (m instanceof OptionalMedia){
					OptionalMedia option = (OptionalMedia) m;
					MediaDescription md = option.getDescription();
					
					if (randomInt(2) == 0)			
						res.add("file \'" + md.getLocation()+ "\'\n");		
			}
			
			if (m instanceof AlternativesMedia){
				AlternativesMedia alter = (AlternativesMedia) m;
				if(index>=names.size() || alter.getId().equals("v04")) {
					EList<MediaDescription> liste = alter.getMedias();
					int nb = randomInt(liste.size());
					res.add("file \'" + liste.get(nb).getLocation()+ "\'\n");
				} else {
					res.add("file \'" +names.get(index)+ "\'\n");
					index++;
				}
			}
		}
		index = 0;
		return res;
	}
	
	private int randomInt(int possibilities) {
		Random random = new Random();
		int nb = random.nextInt();
		if (nb<0) nb = (nb * -1);
		return nb  % possibilities;
	}
	
	
	private List<String> getFilenames(List<Video> variants) {
		return variants.stream().map(v -> v.getUrl().split("/")[1]).collect(Collectors.toList());
	}
	

}
