package fr.istic.videogen.service;

import java.util.List;

import fr.istic.videoGen.VideoGeneratorModel;
import fr.istic.videogen.dto.Video;

public interface IModelService {
	
	List<String> modelToPlayList(VideoGeneratorModel videoGen, List<Video> variants);

}
