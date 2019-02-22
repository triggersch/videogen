import { Component, OnInit } from '@angular/core';
import { Image } from '../model/image.model';
import { Router } from '@angular/router';
import { ApiService } from '../model/api.service';
import { SpinnerService } from '../spinner/spinner.service';
import { VideoService } from '../model/video.service';

@Component({
  selector: 'app-images',
  templateUrl: './images.component.html',
  styleUrls: ['./images.component.css']
})
export class ImagesComponent implements OnInit {

  images:Image[];
  selectedId:number[]=[];

  selectedCount = 0;

  constructor(private apiService:ApiService,
              private videoService:VideoService,
              private router: Router,
              private spinnerService: SpinnerService) { 

    this.apiService.getThumbs().subscribe(ims=>{
      this.images = ims;
    })
  }

  ngOnInit() {
  }

  selectImage(e,image:any){
    //e.preventDefault()
    image.selected = ! image.selected;

    (image.selected)? this.selectedCount+=1 : this.selectedCount -=1 ;

    if (this.selectedCount===3){

      this.goNext();
    }
    
  }

  goNext(){

        this.selectedId = this.images.filter(im=> im.selected)
                                     .map(im=>im.id);

        this.spinnerService.showSpinner();

        this.apiService.getGeneratedVideo(this.selectedId).subscribe(s =>{
          
          this.videoService.setName(s);
          this.spinnerService.hideSpinner();
          this.router.navigateByUrl("/video");
        })
         
  }

}
