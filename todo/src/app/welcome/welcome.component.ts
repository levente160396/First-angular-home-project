import { Component, OnInit } from '@angular/core';
import { AppComponent } from '../app.component';
import { ActivatedRoute } from '@angular/router';
import { WelcomeDataService } from '../service/data/welcome-data.service';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  message : string = 'Some welcome Message'
  welcomeMessageFromService: string;
  name : string

  constructor(private route:ActivatedRoute, private service: WelcomeDataService) { }

  ngOnInit() {
    console.log(this.message)
    console.log(this.route.snapshot.params['name'])
    this.name = this.route.snapshot.params['name'];
  }
  getWelcomeMessage(){
   //console.log( this.service.executeHelloWorldBeanService());
   this.service.executeHelloWorldServiceWithPathVariable(this.name).subscribe(
    response => this.handleSuccesFullResponse(response)

    ); 
    console.log('last line of get getWelcomeMessage');
  }
  handleSuccesFullResponse(response){
      this.welcomeMessageFromService = response.message;
  }
}
