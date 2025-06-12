import { Component } from '@angular/core';
import { User } from '../../core/interface/user';
import { UserService } from '../../core/service/user.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent {
  constructor(
    private userService: UserService,
    private router: Router
  ) {
  }

  userRegister: User = {
    username: "",
    password: "",
  }

  register() {

    this.userService.register(this.userRegister).subscribe({
      next: (response: User) => {
        console.log("thành coong")
      },
      error:(err) =>{
        console.error("looix",err)
    }

    })

  }

  exit() {
    this.router.navigate(['/login'])

  }


}
