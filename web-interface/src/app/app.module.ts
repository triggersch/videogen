import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from "@angular/common/http";
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { ImagesComponent } from './images/images.component';
import { VideoComponent } from './video/video.component';
import { RouterModule } from "@angular/router";
import { FirstGuard } from './first.guard';
import { ModelModule } from './model/model.module';
import { SpinnerComponent } from './spinner/spinner.component';
import { SpinnerService } from './spinner/spinner.service';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    ImagesComponent,
    VideoComponent,
    SpinnerComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    ModelModule,
    HttpClientModule,
    RouterModule.forRoot([
      {
        path:"user", component:UserComponent,
        canActivate: [FirstGuard]
      },
      {
        path:"images", component:ImagesComponent,
        canActivate: [FirstGuard]
      },
      {
        path:"video", component:VideoComponent,
        canActivate: [FirstGuard]
      },
      {path:"**", redirectTo:"/user"}
    ])
  ],
  providers: [FirstGuard, SpinnerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
