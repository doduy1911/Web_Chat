import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { features } from 'process';
import { LoginComponent } from './auth/login/login.component';

const routes: Routes = [
  {
    path: '',
    title: "Chat App ",
    loadChildren: () => import('./features/user/user.module').then(m => m.UserModule)

  },
  {
    path: "login",
    title: "login",
    component: LoginComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
