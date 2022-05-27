import { Component, OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Router} from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  samlResponse : any;

  constructor( private http : HttpClient , private router : Router) { }

  ngOnInit(): void {
  }

  doIt() {

    this.http.get('http').subscribe (data=> {
      this.samlResponse = data;
    })
  }

}
