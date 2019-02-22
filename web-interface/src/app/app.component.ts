import { Component, OnInit } from '@angular/core';
import { SpinnerService } from './spinner/spinner.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'videogen-ui';

  isSpinnerVisible = false;

  constructor(private spinnerService: SpinnerService){
  }

  ngOnInit() {
    // Affiche ou masque le spinner quand demandé
    this.spinnerService.spinnerStatus.subscribe(
      (spinnerStatus: boolean) => this.isSpinnerVisible = spinnerStatus
    );

  }
}
