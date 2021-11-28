import { Injectable } from '@angular/core';

import {HttpClient} from '@angular/common/http'
import { User } from './user';
@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
  
  constructor(private http : HttpClient) { }
  

  public doRegister(user: User){
    return this.http.post("http://localhost:8080/add-user",user, {responseType : "text" as "json"})

  }

  public showAllUsers(){
    return this.http.get("http://localhost:8080/show-user");
  }

  public searchUserByUsername(username:any){
    return this.http.get("http://localhost:8080/search/"+username)
  }

  public deleteUserByUsername(username:any){
    return this.http.get("http://localhost:8080/delete/"+username)
  }
}
