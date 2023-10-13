/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SiloeSoft.Modelos;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "tutor")
@Entity
public class Tutor implements Serializable{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_tutor")
    private Integer id_tutor;
    
    @NotNull
    @Column(name = "cedula", unique = true)
    private String cedula;
    
    @NotNull
    @Column(name ="nombre")
    private String nombre;
    
    @NotNull
    @Column(name = "apellidos")
    private String apellidos;
    
    @NotNull
    @Column(name ="direccion")
    private String direccion;
    
    @NotNull
    @Column(name ="celular")
    private String celular;
    
    @NotNull
    @Column(name ="email")
    private String email;
    

    public Integer getId_tutor() {
        return id_tutor;
    }

    public void setId_tutor(Integer id_tutor) {
        this.id_tutor = id_tutor;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
