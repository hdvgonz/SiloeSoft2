/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SiloeSoft.Controllers;

import com.example.SiloeSoft.Modelos.Administrativo;
import com.example.SiloeSoft.Servicios.AdministrativoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/Administrativo")
public class AdministrativoController {
    @Autowired
    private AdministrativoServicio admServicio;
    
    @PostMapping("/agregar")
    public ResponseEntity<Administrativo> guardar (@RequestBody Administrativo adm) {
        
        Administrativo obj = admServicio.guardar(adm);
        
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }
    
    @PostMapping("/editar/{id}")
    public ResponseEntity<Administrativo> editar (@RequestBody Administrativo adm, @PathVariable Integer id) {
        
        Administrativo obj = admServicio.encontrarPorId(id);
        
        if(obj != null) {
            obj.setNombre_adm(adm.getNombre_adm());
            obj.setApellidos_adm(adm.getApellidos_adm());
            obj.setCargo(adm.getCargo());
            obj.setDireccion_adm(adm.getDireccion_adm());
            obj.setEmail_adm(adm.getEmail_adm());
            obj.setCelular_adm(obj.getCelular_adm());
            admServicio.guardar(obj);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<Administrativo> borrar (@PathVariable Integer id) {
        Administrativo obj = admServicio.encontrarPorId(id);
        
        if (obj != null) {
            admServicio.borrar(id);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @GetMapping("/lista")
    public List<Administrativo> listarTodo() {
        return admServicio.listarTodo();
    }
    
    @GetMapping("/lista/{id}")
    public Administrativo listarPorId(@PathVariable Integer id) {
        return admServicio.encontrarPorId(id);
    }
}
