import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../user-service.service';
import { User } from '../User';
@Component({
  selector: 'app-registers',
  templateUrl: './registers.component.html',
  styleUrls: ['./registers.component.scss']
})
export class RegistersComponent implements OnInit {
  
  user:User=new User("","","","",0,"");
  message:any;

  constructor(private service : UserServiceService) { }

  

  ngOnInit(): void {
  }

  public registerNow(){
    
    let response = this.service.doRegister(this.user);
    response.subscribe(data => {
      this.message = data;
    })
  }

}
