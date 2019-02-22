package fr.istic.videogen.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import fr.istic.videogen.dto.Image;

@Repository
public class ImagesRepository implements IRepository {
	
	private List<Image> images;
	
	
	

	public ImagesRepository() {
		this.images = new ArrayList<>();
		images.add(new Image(1l, "/img/image1.jpg"));
		images.add(new Image(2l, "/img/image2.jpg"));
		//images.add(new Image(3l, "/img/image3.png"));
		images.add(new Image(4l, "/img/image4.jpg"));
		images.add(new Image(5l, "/img/image5.jpg"));
		images.add(new Image(6l, "/img/image6.jpg"));
		images.add(new Image(7l, "/img/image7.jpg"));
		images.add(new Image(8l, "/img/image8.jpg"));
		images.add(new Image(9l, "/img/image9.jpg"));
	}

	@Override
	public List<Image> getImages() {
		return this.images;
	}

	@Override
	public Image getOneImage(Long Id) {
		return this.images.stream().filter(i -> i.getId() == Id).findFirst().get();
	}

	@Override
	public List<Image> getImageFromIds(List<Long> ids) {
		return this.images.stream().filter(i-> ids.contains(i)).collect(Collectors.toList());
	}

}
