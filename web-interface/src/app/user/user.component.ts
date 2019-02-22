import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormControl, AbstractControl } from "@angular/forms";
import { User } from '../model/user.model';
import { Router } from '@angular/router';
import { SpinnerService } from '../spinner/spinner.service';
import { ApiService } from '../model/api.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  userForm: FormGroup;
  submitted = false;

  user:User = new User();
  constructor(private router: Router,
              private apiService:ApiService,
              private spinnerService: SpinnerService) { }

  ngOnInit() {
    this.userForm = new FormGroup({
      username : new FormControl()
    })
  }

  get f() :  {
    [key: string]: AbstractControl
}{return this.userForm.controls}

  goNext(){

    this.submitted = true;
    if( this.userForm.invalid){
      return;
    }

    this.spinnerService.showSpinner();

    this.apiService.addTextToIntro(this.user.name).subscribe(s =>{
      this.spinnerService.hideSpinner();
      this.router.navigateByUrl("/images");
    });
          
    
  }
}
