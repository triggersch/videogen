package fr.istic.videogen.controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.istic.videoGen.VideoGeneratorModel;
import fr.istic.videogen.dto.Image;
import fr.istic.videogen.dto.Video;
import fr.istic.videogen.fileutils.FilesUtils;
import fr.istic.videogen.repository.IRepository;
import fr.istic.videogen.repository.VRepository;
import fr.istic.videogen.service.FFmpegService;
import fr.istic.videogen.service.IModelService;
import fr.istic.videogen.service.IService;
import fr.istic.videogen.tps.VideoGenHelper;

@RestController
@RequestMapping("/api")
public class VideoGenController {
	
	@Autowired
	private IRepository imageRepo;
	
	@Autowired
	private IService service;
	
	@Autowired
	private VRepository videoRepo;
	
	@Autowired
	private IModelService mservice;
	
	@RequestMapping(value="/genvideo",method=RequestMethod.POST)
	public ResponseEntity<?> getGeneratedVideo(@RequestBody List<Long> imageIds ){
		
		Video v = service.generateVideo(imageIds);
		
		return new ResponseEntity<>("\"" + v.getUrl() +"\"" , HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/images", method=RequestMethod.GET)
	public ResponseEntity<?> getImages(){
		List<Image> images = imageRepo.getImages();
		return new ResponseEntity<>(images, HttpStatus.OK);
	}
	
	@RequestMapping(value="/addtext", method=RequestMethod.GET)
	public ResponseEntity<?> addTextToIntro(@RequestParam("text") String text){
		service.addTextToIntro(text);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public ResponseEntity<?> test(){
		
		List<Long> ids = Arrays.asList(new Long[] {2l,4l,7l});
		List<Video> videos = videoRepo.getVideosFromIds(ids);
	
		File dslfile = new FilesUtils().loadingFile2("dsl/exampletp.videogen");
		VideoGeneratorModel videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI(dslfile.getPath()));
		
		return new ResponseEntity<>(mservice.modelToPlayList(videoGen, videos),HttpStatus.OK);
	}
	

}
