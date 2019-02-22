package fr.istic.videogen.service;

import java.util.List;

import fr.istic.videogen.dto.Image;
import fr.istic.videogen.dto.Video;

public interface IService {
	
	List<Image>  getThumbnails();
	
	Video generateVideo(List<Long> thumbs);
	
	void addTextToIntro(String text);

}
