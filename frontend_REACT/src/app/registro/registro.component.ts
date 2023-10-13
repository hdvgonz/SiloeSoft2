import { Component } from '@angular/core';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})



export class RegistroComponent {
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
