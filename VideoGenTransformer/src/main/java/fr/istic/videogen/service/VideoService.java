package fr.istic.videogen.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import fr.istic.videoGen.VideoGeneratorModel;
import fr.istic.videogen.dto.Image;
import fr.istic.videogen.dto.Video;
import fr.istic.videogen.fileutils.FilesUtils;
import fr.istic.videogen.repository.VRepository;
import fr.istic.videogen.tps.VideoGenHelper;

@Service
public class VideoService implements IService {
	
	@Autowired
	private VRepository repo;
	
	@Autowired
	private IModelService mservice;
	
	private FilesUtils filesUtils = new FilesUtils();

	@Override
	public List<Image> getThumbnails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Video generateVideo(List<Long> thumbsId) {
		
		File playlist = genaratePlayList(thumbsId);
		
		return new Video(0l, concatVideo(playlist, thumbsId));
	}
	
	@Override
	public void addTextToIntro(String text) {
		
		File in = new FilesUtils().loadingFile("videos/intro.mp4");
		FFmpegService.addTextToVideo(in, "Bonjour " + text + " !");
	}

	private File genaratePlayList(List<Long> thumbsId) {
		
		
		File playlist = filesUtils.loadingFile("playlists/playlist.txt");
		
		List<Video> videos = repo.getVideosFromIds(thumbsId);
		File dslfile = filesUtils.loadingFile2("dsl/exampletp.videogen");
		VideoGeneratorModel videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI(dslfile.getPath()));
		List<String> strs = mservice.modelToPlayList(videoGen, videos);
		
		List<String> strsWithIntro = new ArrayList<String>();
		strsWithIntro.add("file \'outwithtext.mp4\'\n");
		strsWithIntro.addAll(strs);
		filesUtils.writeListStringToFile(playlist, strsWithIntro);
		return playlist;
	}
	
	private String concatVideo(File playlist, List<Long> ids) {
		
		String suffixe = ids.stream().map(id -> String.valueOf(id)).reduce((id1,id2) -> id1 + '-' + id2).get();
		
		File outDir = filesUtils.loadingFile("outputvideo");
		File out = new File(outDir.getAbsolutePath()+ "/out-" + suffixe +".mp4");
		try {
			FFmpegService.concatVideo(playlist, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return out.getName();
		
	}

}
