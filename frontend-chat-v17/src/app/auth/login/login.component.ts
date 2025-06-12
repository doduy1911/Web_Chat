import { Component } from '@angular/core';
import { User } from "../../core/interface/user";
import { UserService } from "../../core/service/user.service";
import { Router } from '@angular/router';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {

  user: User = {
    username: "",
    password: ""
  }

  constructor(
    private userService: UserService,
    private router: Router
  ) {
  }


  login() {
    if (!this.user.username || !this.user.password) return;
    this.user.username = this.user.username.trim();
    this.user.password = this.user.password.trim();
    this.userService.login(this.user).subscribe({
      next: (response: User) => {
        console.log(response)
        this.userService.saveToLocalStorage(response)
        this.router.navigate(['/'])

      },
      error: (error: any) => {
        console.log(error)
      }
    })
  }

  register() {
    this.router.navigate(['/login/register'])
  }
}
