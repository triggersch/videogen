import { Injectable } from "@angular/core";
import { HttpClient, HttpParams } from "@angular/common/http";
import { Observable } from "rxjs";
import { Image } from "./image.model";

@Injectable()
export class ApiService{

    private baseUrl = '/api/'

    constructor(private http: HttpClient){}

    getThumbs(): Observable<Image[]>{
        return this.http.get<Image[]>(this.baseUrl+'images');
    }

    getGeneratedVideo(selectedIds: number[]):Observable<string>{
        return this.http.post<string>(this.baseUrl + 'genvideo', selectedIds);
    }

    addTextToIntro(greeting: string):Observable<any>{
        return this.http.get(this.baseUrl + 'addtext',{params:new HttpParams().set('text',greeting)});
    }

}