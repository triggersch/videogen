import { Injectable } from '@angular/core';
import {BehaviorSubject} from 'rxjs';

@Injectable()
export class SpinnerService {

  private _spinnerStatus: BehaviorSubject<boolean> = new BehaviorSubject<boolean>(false);
  private _spinnerCount = 0;

  constructor() { }

  get spinnerStatus(): BehaviorSubject<boolean> {
    return this._spinnerStatus;
  }

  showSpinner() {
    this._spinnerCount++;
    this._spinnerStatus.next(true);
  }

  hideSpinner() {
    this._spinnerCount--;
    if (this._spinnerCount === 0) {
      this._spinnerStatus.next(false);
    }
  }

}