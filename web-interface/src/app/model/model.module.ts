import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ApiService } from './api.service';
import { VideoService } from './video.service';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [],
  providers: [ApiService, VideoService]
})
export class ModelModule { }
