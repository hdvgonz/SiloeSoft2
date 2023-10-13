import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from "./app.component";
import { LoginComponent } from "./login/login.component";
import { RegistroComponent } from "./registro/registro.component";
import { RetiroComponent } from './retiro/retiro.component';
import { SeguimientoComponent } from './seguimiento/seguimiento.component';
import { RegistroTutorComponent} from './registroTutor/registroTutor.component'

const routes: Routes = [
  { path: "", component: AppComponent, pathMatch: "full" },
  { path: "login", component: LoginComponent, pathMatch: "full" },
  { path: "registro", component: RegistroComponent, pathMatch: "full" },
  { path: "retiro", component: RetiroComponent, pathMatch: "full"},
  { path: "seguimiento", component: SeguimientoComponent, pathMatch: "full"},
  { path: "registroTutor", component: RegistroTutorComponent, pathMatch: "full"},



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routing = RouterModule.forRoot(routes);
