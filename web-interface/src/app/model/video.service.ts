import { Injectable } from "@angular/core";

@Injectable()
export class VideoService{

    private videoname: string = '';

    getName():string{
        return this.videoname;
    }

    setName(name:string){
        this.videoname = name;
    }
}