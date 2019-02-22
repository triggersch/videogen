import { Component, OnInit } from '@angular/core';
import { VideoService } from '../model/video.service';

@Component({
  selector: 'app-video',
  templateUrl: './video.component.html',
  styleUrls: ['./video.component.css']
})
export class VideoComponent implements OnInit {

  videoname:string='';
  constructor(private videoService:VideoService) {
    this.videoname = videoService.getName();
   }

  ngOnInit() {
  }

}
