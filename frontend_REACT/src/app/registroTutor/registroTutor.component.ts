import { Component } from '@angular/core';

@Component({
  selector: 'app-registro-tutor',
  templateUrl: './registroTutor.component.html',
  styleUrls: ['./registroTutor.component.css']
})

export class RegistroTutorComponent{
  nombres!: string;
  apellidos!: string;
  direccion!: string;
  email!: string;
  celular!: string;

  constructor() {}

  register() {
    console.log(this.nombres);
    console.log(this.apellidos);
    console.log(this.direccion);
    console.log(this.email);
    console.log(this.celular);
  }
}
