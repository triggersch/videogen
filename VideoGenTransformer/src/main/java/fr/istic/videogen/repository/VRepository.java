package fr.istic.videogen.repository;

import java.util.List;

import fr.istic.videogen.dto.Video;

public interface VRepository {
	
	List<Video> getVideos();
	List<Video> getVideosFromIds(List<Long> imageIds);
	Video getOneVideo(Long videoId);
	

}
