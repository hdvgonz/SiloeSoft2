import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from "./login/login.component";
import { RegistroComponent } from './registro/registro.component';
import { RetiroComponent } from './retiro/retiro.component';
import { SeguimientoComponent } from './seguimiento/seguimiento.component';
import { RegistroTutorComponent } from './registroTutor/registroTutor.component';
import { SearchFilterPipe } from './search-filter.pipe';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistroComponent,
    RetiroComponent,
    SeguimientoComponent,
    RegistroTutorComponent,
    SearchFilterPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
