import { Injectable } from '@angular/core';
import { User } from "../interface/user";
import { Observable } from "rxjs";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { environment } from "../../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private apiUrl = environment.apiUrl + environment.apiVersion + "/users"
  private apiregister = environment.apiUrl + environment.apiVersion + "/register"

  constructor(
    private http: HttpClient
  ) {
    console.log(environment)

  }

  login(user: User): Observable<User> {

    return this.http.post(this.apiUrl, user)

  }

  register(userRegister: User): Observable<User> {
    const jsonData = JSON.stringify(userRegister); // Chuyển thành chuỗi JSON
    const headers = new HttpHeaders({ 'Content-Type': 'application/json' });

    return this.http.post<User>(this.apiregister, jsonData, { headers })
  }

  saveToLocalStorage(user: User) {

    localStorage.setItem('user', JSON.stringify({
      username: user.username,
      avatarUrl: user.avatarUrl

    }))

  }
}
