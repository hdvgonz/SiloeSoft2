/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SiloeSoft.Modelos;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "administrativo")
@Entity
public class Administrativo implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adm")
    private Integer id_adm;

    @NotNull
    @Column(name = "cedula", unique = true)
    private String cedula;
    
    @NotNull
    @Column(name = "nombre_adm")
    private String nombre_adm;

    @NotNull
    @Column(name = "apellidos_adm")
    private String apellidos_adm;

    @NotNull
    @Column(name = "celular_adm")
    private String celular_adm;
    
    @NotNull
    @Column(name = "email_adm", unique = true)
    private String email_adm;

    @NotNull
    @Column(name = "direccion_adm")
    private String direccion_adm;

    @NotNull
    @Column(name = "cargo_adm")
    private String cargo;

    public Integer getId_adm() {
        return id_adm;
    }

    public void setId_adm(Integer id_adm) {
        this.id_adm = id_adm;
    }

    public String getNombre_adm() {
        return nombre_adm;
    }

    public void setNombre_adm(String nombre_adm) {
        this.nombre_adm = nombre_adm;
    }

    public String getApellidos_adm() {
        return apellidos_adm;
    }

    public void setApellidos_adm(String apellidos_adm) {
        this.apellidos_adm = apellidos_adm;
    }

    public String getCelular_adm() {
        return celular_adm;
    }

    public void setCelular_adm(String celular_adm) {
        this.celular_adm = celular_adm;
    }

    public String getDireccion_adm() {
        return direccion_adm;
    }

    public void setDireccion_adm(String direccion_adm) {
        this.direccion_adm = direccion_adm;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
       public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail_adm() {
        return email_adm;
    }

    public void setEmail_adm(String email_adm) {
        this.email_adm = email_adm;
    }
    

}
