import { Component, OnInit } from '@angular/core';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';
import { Router } from '@angular/router';
import { HardcodedAuthenticationService } from '../service/hardcoded-authentication.service';
import { BasicAuthenticationService } from '../service/basicauthentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username = 'in28minutes';
  password = ''
  errorMessage : string =' Invalid Credentials';
  invalidLogin = false;



  constructor(
      private router: Router,
      private has: HardcodedAuthenticationService,
      private basicAuthservice : BasicAuthenticationService) { }

  ngOnInit() {
  }

  handleLogin(){
    if(this.has.authenticate(this.username,this.password)){
      this.router.navigate(['welcome',this.username])
      this.invalidLogin = false;
    }else{
      this.invalidLogin = true;
    }
  }

  handleBasicAuthLogin(){
   this.basicAuthservice.executeAuthenticationService(this.username,this.password)
      .subscribe(
        data => {
          console.log(data);
          this.invalidLogin = false;
          this.router.navigate(['welcome',this.username]);

        },
        error =>{
          console.log(error);
          this.invalidLogin = true;
        }
      )

  }
  handleJWTAuthLogin(){
    this.basicAuthservice.executeJWTAuthenticationService(this.username,this.password)
       .subscribe(
         data => {
           console.log(data);
           this.invalidLogin = false;
           this.router.navigate(['welcome',this.username]);
 
         },
         error =>{
           console.log(error);
           this.invalidLogin = true;
         }
       )
 
   }

}
