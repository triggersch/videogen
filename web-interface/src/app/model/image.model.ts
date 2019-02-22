export class Image {
    constructor(
        public id?: number,
        public nom?: string,
        public description? : string,
        public url?: string,
        public selected:boolean = false){}
}