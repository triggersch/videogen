package fr.istic.videogen.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import fr.istic.videogen.dto.Video;

@Repository
public class VideosRepository implements VRepository {
	
	private List<Video> videos;
	
	public VideosRepository() {
		videos = new ArrayList<Video>();
		
		videos.add(new Video(1l, "videos/v101a.mp4"));
		videos.add(new Video(2l, "videos/v102a.mp4"));
		videos.add(new Video(3l, "videos/v103a.mp4"));
		
		videos.add(new Video(4l, "videos/v104a.mp4"));
		videos.add(new Video(5l, "videos/v105a.mp4"));
		videos.add(new Video(6l, "videos/v106a.mp4"));
		
		videos.add(new Video(7l, "videos/v107a.mp4"));
		videos.add(new Video(8l, "videos/v108a.mp4"));
		videos.add(new Video(9l, "videos/v109a.mp4"));
		
	}

	@Override
	public List<Video> getVideos() {
		return videos;
	}

	@Override
	public List<Video> getVideosFromIds(List<Long> imageIds) {
		return videos.stream()
				     .filter(v -> imageIds.contains(v.getId()))
				     .collect(Collectors.toList());
	}

	@Override
	public Video getOneVideo(Long videoId) {
		return videos.stream()
				     .filter(v -> v.getId().equals(videoId))
				     .findFirst().get();
	}

}
