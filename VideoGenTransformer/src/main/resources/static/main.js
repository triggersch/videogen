(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!--The content below is only a placeholder and can be replaced.-->\r\n<div style=\"text-align:center\">\r\n  <div class=\"jumbotron\">\r\n      <h1 class=\"display-4\"> Bienvenue sur VideoGen</h1>\r\n      <p class=\"lead\">Ce ci est le projet DSL pour IDM 18/19</p>\r\n      <hr class=\"my-4\">\r\n      <p>Ce projet à été développer avec ecplise xtext pour le DSL, Spring pour le back et angular pour le front</p>\r\n      <a class=\"btn btn-primary btn-lg\" href=\"#\" role=\"button\">En savoir plus</a>\r\n    </div>\r\n</div>\r\n<router-outlet></router-outlet>\r\n\r\n<footer class=\"page-footer font-small blue\">\r\n\r\n    \r\n    <div class=\"footer-copyright text-center py-3\">© 2018 Copyright:\r\n      Lachaal Abdallah & Bouyamine Mounir\r\n    </div>\r\n    \r\n  \r\n  </footer>\r\n<app-spinner *ngIf=\"isSpinnerVisible\" ></app-spinner>\r\n\r\n\r\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _spinner_spinner_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./spinner/spinner.service */ "./src/app/spinner/spinner.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var AppComponent = /** @class */ (function () {
    function AppComponent(spinnerService) {
        this.spinnerService = spinnerService;
        this.title = 'videogen-ui';
        this.isSpinnerVisible = false;
    }
    AppComponent.prototype.ngOnInit = function () {
        var _this = this;
        // Affiche ou masque le spinner quand demandé
        this.spinnerService.spinnerStatus.subscribe(function (spinnerStatus) { return _this.isSpinnerVisible = spinnerStatus; });
    };
    AppComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        }),
        __metadata("design:paramtypes", [_spinner_spinner_service__WEBPACK_IMPORTED_MODULE_1__["SpinnerService"]])
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _user_user_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./user/user.component */ "./src/app/user/user.component.ts");
/* harmony import */ var _images_images_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./images/images.component */ "./src/app/images/images.component.ts");
/* harmony import */ var _video_video_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./video/video.component */ "./src/app/video/video.component.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _first_guard__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./first.guard */ "./src/app/first.guard.ts");
/* harmony import */ var _model_model_module__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./model/model.module */ "./src/app/model/model.module.ts");
/* harmony import */ var _spinner_spinner_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./spinner/spinner.component */ "./src/app/spinner/spinner.component.ts");
/* harmony import */ var _spinner_spinner_service__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./spinner/spinner.service */ "./src/app/spinner/spinner.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};













var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_4__["AppComponent"],
                _user_user_component__WEBPACK_IMPORTED_MODULE_5__["UserComponent"],
                _images_images_component__WEBPACK_IMPORTED_MODULE_6__["ImagesComponent"],
                _video_video_component__WEBPACK_IMPORTED_MODULE_7__["VideoComponent"],
                _spinner_spinner_component__WEBPACK_IMPORTED_MODULE_11__["SpinnerComponent"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormsModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_2__["ReactiveFormsModule"],
                _model_model_module__WEBPACK_IMPORTED_MODULE_10__["ModelModule"],
                _angular_common_http__WEBPACK_IMPORTED_MODULE_3__["HttpClientModule"],
                _angular_router__WEBPACK_IMPORTED_MODULE_8__["RouterModule"].forRoot([
                    {
                        path: "user", component: _user_user_component__WEBPACK_IMPORTED_MODULE_5__["UserComponent"],
                        canActivate: [_first_guard__WEBPACK_IMPORTED_MODULE_9__["FirstGuard"]]
                    },
                    {
                        path: "images", component: _images_images_component__WEBPACK_IMPORTED_MODULE_6__["ImagesComponent"],
                        canActivate: [_first_guard__WEBPACK_IMPORTED_MODULE_9__["FirstGuard"]]
                    },
                    {
                        path: "video", component: _video_video_component__WEBPACK_IMPORTED_MODULE_7__["VideoComponent"],
                        canActivate: [_first_guard__WEBPACK_IMPORTED_MODULE_9__["FirstGuard"]]
                    },
                    { path: "**", redirectTo: "/user" }
                ])
            ],
            providers: [_first_guard__WEBPACK_IMPORTED_MODULE_9__["FirstGuard"], _spinner_spinner_service__WEBPACK_IMPORTED_MODULE_12__["SpinnerService"]],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_4__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/first.guard.ts":
/*!********************************!*\
  !*** ./src/app/first.guard.ts ***!
  \********************************/
/*! exports provided: FirstGuard */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FirstGuard", function() { return FirstGuard; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _user_user_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./user/user.component */ "./src/app/user/user.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var FirstGuard = /** @class */ (function () {
    function FirstGuard(router) {
        this.router = router;
        this.firstNavigation = true;
    }
    FirstGuard.prototype.canActivate = function (route, state) {
        if (this.firstNavigation) {
            this.firstNavigation = false;
            if (route.component != _user_user_component__WEBPACK_IMPORTED_MODULE_2__["UserComponent"]) {
                this.router.navigateByUrl("/");
                return false;
            }
        }
        return true;
    };
    FirstGuard = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])(),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_1__["Router"]])
    ], FirstGuard);
    return FirstGuard;
}());



/***/ }),

/***/ "./src/app/images/images.component.css":
/*!*********************************************!*\
  !*** ./src/app/images/images.component.css ***!
  \*********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "* { box-sizing: border-box; }\r\n\r\n\r\n.container-grid-4 {\r\n    display: flex;\r\n    flex-direction: row;\r\n    flex-wrap: wrap;\r\n}\r\n\r\n\r\n.container-grid-4 > * {\r\n    flex: 0 0 auto;\r\n    width: 25%;\r\n}\r\n\r\n\r\n.image-selected{\r\n    border: 3px solid orange;\r\n}"

/***/ }),

/***/ "./src/app/images/images.component.html":
/*!**********************************************!*\
  !*** ./src/app/images/images.component.html ***!
  \**********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\r\n  \r\n<div class=\"alert alert-primary col-md-2 offset-md-5\" role=\"alert\">\r\n        Veuillez choisir trois extraits\r\n      </div>\r\n      <div class=\"container-grid-4\" > \r\n\r\n        <div *ngFor=\"let image of images\"  >\r\n            <a [routerLink]=\"\" (click)=\"selectImage($event,image)\">\r\n\r\n                <img   [ngClass]=\"{'image-selected': image.selected}\"   height=\"150px\" [src]=\"image.url\" alt=\"Card image cap\">\r\n\r\n                <div class=\"\">\r\n                    <h5 class=\"\">{{image.nom}}</h5>\r\n                    <p class=\"\">\r\n                      {{image.description}}\r\n                    </p>  \r\n                  </div>\r\n\r\n              </a>\r\n\r\n        </div>\r\n\r\n        <div *ngIf=\"!images\">\r\n            pas d'images\r\n        </div>\r\n\r\n      </div>\r\n\r\n      <div class=\"col-md-2 offset-md-5\" >\r\n          <button class=\"btn btn-block btn-danger m-t-3\" [routerLink]=\"['/user']\">\r\n              Precedent\r\n              </button>\r\n      </div>\r\n     \r\n\r\n"

/***/ }),

/***/ "./src/app/images/images.component.ts":
/*!********************************************!*\
  !*** ./src/app/images/images.component.ts ***!
  \********************************************/
/*! exports provided: ImagesComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ImagesComponent", function() { return ImagesComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _model_api_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../model/api.service */ "./src/app/model/api.service.ts");
/* harmony import */ var _spinner_spinner_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../spinner/spinner.service */ "./src/app/spinner/spinner.service.ts");
/* harmony import */ var _model_video_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../model/video.service */ "./src/app/model/video.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var ImagesComponent = /** @class */ (function () {
    function ImagesComponent(apiService, videoService, router, spinnerService) {
        var _this = this;
        this.apiService = apiService;
        this.videoService = videoService;
        this.router = router;
        this.spinnerService = spinnerService;
        this.selectedId = [];
        this.selectedCount = 0;
        this.apiService.getThumbs().subscribe(function (ims) {
            _this.images = ims;
        });
    }
    ImagesComponent.prototype.ngOnInit = function () {
    };
    ImagesComponent.prototype.selectImage = function (e, image) {
        //e.preventDefault()
        image.selected = !image.selected;
        (image.selected) ? this.selectedCount += 1 : this.selectedCount -= 1;
        if (this.selectedCount === 3) {
            this.goNext();
        }
    };
    ImagesComponent.prototype.goNext = function () {
        var _this = this;
        this.selectedId = this.images.filter(function (im) { return im.selected; })
            .map(function (im) { return im.id; });
        this.spinnerService.showSpinner();
        this.apiService.getGeneratedVideo(this.selectedId).subscribe(function (s) {
            _this.videoService.setName(s);
            _this.spinnerService.hideSpinner();
            _this.router.navigateByUrl("/video");
        });
    };
    ImagesComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-images',
            template: __webpack_require__(/*! ./images.component.html */ "./src/app/images/images.component.html"),
            styles: [__webpack_require__(/*! ./images.component.css */ "./src/app/images/images.component.css")]
        }),
        __metadata("design:paramtypes", [_model_api_service__WEBPACK_IMPORTED_MODULE_2__["ApiService"],
            _model_video_service__WEBPACK_IMPORTED_MODULE_4__["VideoService"],
            _angular_router__WEBPACK_IMPORTED_MODULE_1__["Router"],
            _spinner_spinner_service__WEBPACK_IMPORTED_MODULE_3__["SpinnerService"]])
    ], ImagesComponent);
    return ImagesComponent;
}());



/***/ }),

/***/ "./src/app/model/api.service.ts":
/*!**************************************!*\
  !*** ./src/app/model/api.service.ts ***!
  \**************************************/
/*! exports provided: ApiService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ApiService", function() { return ApiService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ApiService = /** @class */ (function () {
    function ApiService(http) {
        this.http = http;
        this.baseUrl = '/api/';
    }
    ApiService.prototype.getThumbs = function () {
        return this.http.get(this.baseUrl + 'images');
    };
    ApiService.prototype.getGeneratedVideo = function (selectedIds) {
        return this.http.post(this.baseUrl + 'genvideo', selectedIds);
    };
    ApiService.prototype.addTextToIntro = function (greeting) {
        return this.http.get(this.baseUrl + 'addtext', { params: new _angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpParams"]().set('text', greeting) });
    };
    ApiService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])(),
        __metadata("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]])
    ], ApiService);
    return ApiService;
}());



/***/ }),

/***/ "./src/app/model/model.module.ts":
/*!***************************************!*\
  !*** ./src/app/model/model.module.ts ***!
  \***************************************/
/*! exports provided: ModelModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ModelModule", function() { return ModelModule; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/fesm5/common.js");
/* harmony import */ var _api_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./api.service */ "./src/app/model/api.service.ts");
/* harmony import */ var _video_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./video.service */ "./src/app/model/video.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};




var ModelModule = /** @class */ (function () {
    function ModelModule() {
    }
    ModelModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["NgModule"])({
            imports: [
                _angular_common__WEBPACK_IMPORTED_MODULE_1__["CommonModule"]
            ],
            declarations: [],
            providers: [_api_service__WEBPACK_IMPORTED_MODULE_2__["ApiService"], _video_service__WEBPACK_IMPORTED_MODULE_3__["VideoService"]]
        })
    ], ModelModule);
    return ModelModule;
}());



/***/ }),

/***/ "./src/app/model/user.model.ts":
/*!*************************************!*\
  !*** ./src/app/model/user.model.ts ***!
  \*************************************/
/*! exports provided: User */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "User", function() { return User; });
var User = /** @class */ (function () {
    function User(id, name, login, passwd) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.passwd = passwd;
    }
    return User;
}());



/***/ }),

/***/ "./src/app/model/video.service.ts":
/*!****************************************!*\
  !*** ./src/app/model/video.service.ts ***!
  \****************************************/
/*! exports provided: VideoService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "VideoService", function() { return VideoService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var VideoService = /** @class */ (function () {
    function VideoService() {
        this.videoname = '';
    }
    VideoService.prototype.getName = function () {
        return this.videoname;
    };
    VideoService.prototype.setName = function (name) {
        this.videoname = name;
    };
    VideoService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])()
    ], VideoService);
    return VideoService;
}());



/***/ }),

/***/ "./src/app/spinner/spinner.component.css":
/*!***********************************************!*\
  !*** ./src/app/spinner/spinner.component.css ***!
  \***********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".spinner {\r\n    height: 60px;\r\n    text-align: center;\r\n    font-size: 10px;\r\n    position: fixed;\r\n    z-index: 1101;\r\n    top: 50%;\r\n    left: 50%;\r\n    -webkit-transform: translateX(-50%) translateY(-50%);\r\n            transform: translateX(-50%) translateY(-50%);\r\n  }\r\n  \r\n  .spinner > div {\r\n    border-radius: 0;\r\n    height: 100%;\r\n    background-color: #0033cc;\r\n    width: 6px;\r\n    display: inline-block;\r\n    margin-right: 1px;\r\n  \r\n    -webkit-animation: sk-stretchdelay 1.2s infinite ease-in-out;\r\n    animation: sk-stretchdelay 1.2s infinite ease-in-out;\r\n  }\r\n  \r\n  .spinner .rect2 {\r\n    -webkit-animation-delay: -1.1s;\r\n    animation-delay: -1.1s;\r\n  }\r\n  \r\n  .spinner .rect3 {\r\n    -webkit-animation-delay: -1.0s;\r\n    animation-delay: -1.0s;\r\n  }\r\n  \r\n  .spinner .rect4 {\r\n    -webkit-animation-delay: -0.9s;\r\n    animation-delay: -0.9s;\r\n  }\r\n  \r\n  .spinner .rect5 {\r\n    -webkit-animation-delay: -0.8s;\r\n    animation-delay: -0.8s;\r\n  }\r\n  \r\n  @-webkit-keyframes sk-stretchdelay {\r\n    0%, 40%, 100% {\r\n      -webkit-transform: scaleY(0.4)\r\n    }\r\n    20% {\r\n      -webkit-transform: scaleY(1.0)\r\n    }\r\n  }\r\n  \r\n  @keyframes sk-stretchdelay {\r\n    0%, 40%, 100% {\r\n      transform: scaleY(0.4);\r\n      -webkit-transform: scaleY(0.4);\r\n    }\r\n    20% {\r\n      transform: scaleY(1.0);\r\n      -webkit-transform: scaleY(1.0);\r\n    }\r\n  }\r\n  \r\n  div.cover {\r\n    z-index: 1100;\r\n    background-color: white;\r\n    opacity: 0.7;\r\n    position: fixed;\r\n    width: 100%;\r\n    height: 100%;\r\n    top: 0px;\r\n    left: 0px;\r\n  }\r\n  "

/***/ }),

/***/ "./src/app/spinner/spinner.component.html":
/*!************************************************!*\
  !*** ./src/app/spinner/spinner.component.html ***!
  \************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"spinner\">\n  <div class=\"rect1\"></div>\n  <div class=\"rect2\"></div>\n  <div class=\"rect3\"></div>\n  <div class=\"rect4\"></div>\n  <div class=\"rect5\"></div>\n</div>\n<div class=\"cover\"></div>\n"

/***/ }),

/***/ "./src/app/spinner/spinner.component.ts":
/*!**********************************************!*\
  !*** ./src/app/spinner/spinner.component.ts ***!
  \**********************************************/
/*! exports provided: SpinnerComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SpinnerComponent", function() { return SpinnerComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var SpinnerComponent = /** @class */ (function () {
    function SpinnerComponent() {
    }
    SpinnerComponent.prototype.ngOnInit = function () {
    };
    SpinnerComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-spinner',
            template: __webpack_require__(/*! ./spinner.component.html */ "./src/app/spinner/spinner.component.html"),
            styles: [__webpack_require__(/*! ./spinner.component.css */ "./src/app/spinner/spinner.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], SpinnerComponent);
    return SpinnerComponent;
}());



/***/ }),

/***/ "./src/app/spinner/spinner.service.ts":
/*!********************************************!*\
  !*** ./src/app/spinner/spinner.service.ts ***!
  \********************************************/
/*! exports provided: SpinnerService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SpinnerService", function() { return SpinnerService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var SpinnerService = /** @class */ (function () {
    function SpinnerService() {
        this._spinnerStatus = new rxjs__WEBPACK_IMPORTED_MODULE_1__["BehaviorSubject"](false);
        this._spinnerCount = 0;
    }
    Object.defineProperty(SpinnerService.prototype, "spinnerStatus", {
        get: function () {
            return this._spinnerStatus;
        },
        enumerable: true,
        configurable: true
    });
    SpinnerService.prototype.showSpinner = function () {
        this._spinnerCount++;
        this._spinnerStatus.next(true);
    };
    SpinnerService.prototype.hideSpinner = function () {
        this._spinnerCount--;
        if (this._spinnerCount === 0) {
            this._spinnerStatus.next(false);
        }
    };
    SpinnerService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])(),
        __metadata("design:paramtypes", [])
    ], SpinnerService);
    return SpinnerService;
}());



/***/ }),

/***/ "./src/app/user/user.component.css":
/*!*****************************************!*\
  !*** ./src/app/user/user.component.css ***!
  \*****************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/user/user.component.html":
/*!******************************************!*\
  !*** ./src/app/user/user.component.html ***!
  \******************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"p-2 col-md-2 offset-md-5\">\r\n\r\n    <div class=\"form-group\">\r\n        <form  [formGroup]=\"userForm\" (ngSubmit)=\"goNext()\" >\r\n        <label>Entrez Votre nom</label>\r\n        <input class=\"form-control\" name=\"username\" type=\"text\" \r\n               formControlName=\"username\"\r\n               [ngClass]=\"{'is-invalid':submitted && f.username.errors}\"\r\n              [(ngModel)]=\"user.name\" required />\r\n              <div *ngIf=\"submitted && f['username'].errors \" class=\"invalid-feedback\">\r\n                    <div *ngIf=\"f['username'].errors.required\">le Nom est requis</div>\r\n                </div>\r\n              <button type=\"submit\" class=\"btn btn-block btn-danger m-t-3\" >\r\n                Suivant\r\n                </button>\r\n            </form> \r\n      </div>\r\n\r\n  </div>"

/***/ }),

/***/ "./src/app/user/user.component.ts":
/*!****************************************!*\
  !*** ./src/app/user/user.component.ts ***!
  \****************************************/
/*! exports provided: UserComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UserComponent", function() { return UserComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _model_user_model__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../model/user.model */ "./src/app/model/user.model.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _spinner_spinner_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../spinner/spinner.service */ "./src/app/spinner/spinner.service.ts");
/* harmony import */ var _model_api_service__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../model/api.service */ "./src/app/model/api.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var UserComponent = /** @class */ (function () {
    function UserComponent(router, apiService, spinnerService) {
        this.router = router;
        this.apiService = apiService;
        this.spinnerService = spinnerService;
        this.submitted = false;
        this.user = new _model_user_model__WEBPACK_IMPORTED_MODULE_2__["User"]();
    }
    UserComponent.prototype.ngOnInit = function () {
        this.userForm = new _angular_forms__WEBPACK_IMPORTED_MODULE_1__["FormGroup"]({
            username: new _angular_forms__WEBPACK_IMPORTED_MODULE_1__["FormControl"]()
        });
    };
    Object.defineProperty(UserComponent.prototype, "f", {
        get: function () { return this.userForm.controls; },
        enumerable: true,
        configurable: true
    });
    UserComponent.prototype.goNext = function () {
        var _this = this;
        this.submitted = true;
        if (this.userForm.invalid) {
            return;
        }
        this.spinnerService.showSpinner();
        this.apiService.addTextToIntro(this.user.name).subscribe(function (s) {
            _this.spinnerService.hideSpinner();
            _this.router.navigateByUrl("/images");
        });
    };
    UserComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-user',
            template: __webpack_require__(/*! ./user.component.html */ "./src/app/user/user.component.html"),
            styles: [__webpack_require__(/*! ./user.component.css */ "./src/app/user/user.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_3__["Router"],
            _model_api_service__WEBPACK_IMPORTED_MODULE_5__["ApiService"],
            _spinner_spinner_service__WEBPACK_IMPORTED_MODULE_4__["SpinnerService"]])
    ], UserComponent);
    return UserComponent;
}());



/***/ }),

/***/ "./src/app/video/video.component.css":
/*!*******************************************!*\
  !*** ./src/app/video/video.component.css ***!
  \*******************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".video-box {\r\n    display: flex;\r\n    align-items: center;\r\n    justify-content: center;\r\n  }"

/***/ }),

/***/ "./src/app/video/video.component.html":
/*!********************************************!*\
  !*** ./src/app/video/video.component.html ***!
  \********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\r\n<div class=\"video-box\" >\r\n\r\n<video width=\"700\"  controls>\r\n    <source src=\"{{'/video/' + videoname}}\" type=\"video/mp4\">\r\n    Your browser does not support the video tag.\r\n  </video>\r\n</div>\r\n<div class=\"container\">\r\n    <div class=\"row\">\r\n<div class=\"col-md-2 offset-md-2\" >\r\n  <button class=\"btn btn-block btn-danger m-t-3\" [routerLink]=\"['/user']\">\r\n      Acceuil\r\n      </button>\r\n</div>\r\n<div class=\"col-md-2\" >\r\n        <a class=\"btn btn-block btn-success m-t-3\" href=\"/csv/csv-file.csv\" role=\"button\">Télécharger CSV</a>\r\n  </div>\r\n  <div class=\"col-md-2\" >\r\n      <a class=\"btn btn-block btn-warning m-t-3\" href=\"/playlist/playlist.txt\" role=\"button\" target=\"_blank\" >Télécharger PlayList</a>\r\n</div>\r\n<div class=\"col-md-2\" >\r\n    <a class=\"btn btn-block btn-primary m-t-3\" href=\"/dsl/exampletp.videogen\" role=\"button\">Télécharger Modèle</a>\r\n</div>\r\n</div>\r\n</div>"

/***/ }),

/***/ "./src/app/video/video.component.ts":
/*!******************************************!*\
  !*** ./src/app/video/video.component.ts ***!
  \******************************************/
/*! exports provided: VideoComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "VideoComponent", function() { return VideoComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _model_video_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../model/video.service */ "./src/app/model/video.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var VideoComponent = /** @class */ (function () {
    function VideoComponent(videoService) {
        this.videoService = videoService;
        this.videoname = '';
        this.videoname = videoService.getName();
    }
    VideoComponent.prototype.ngOnInit = function () {
    };
    VideoComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-video',
            template: __webpack_require__(/*! ./video.component.html */ "./src/app/video/video.component.html"),
            styles: [__webpack_require__(/*! ./video.component.css */ "./src/app/video/video.component.css")]
        }),
        __metadata("design:paramtypes", [_model_video_service__WEBPACK_IMPORTED_MODULE_1__["VideoService"]])
    ], VideoComponent);
    return VideoComponent;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false
};
/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! C:\Users\abdallah.lachaal\AppData\Local\Temp\videogen\web-interface\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map