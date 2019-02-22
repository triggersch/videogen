package fr.istic.videogen.repository;

import java.util.List;

import fr.istic.videogen.dto.Image;

public interface IRepository {
	
	List<Image> getImages();
	Image getOneImage(Long Id);
	List<Image> getImageFromIds(List<Long> ids);

}
