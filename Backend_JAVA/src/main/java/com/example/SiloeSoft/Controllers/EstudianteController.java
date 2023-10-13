/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SiloeSoft.Controllers;

import com.example.SiloeSoft.Modelos.Estudiante;
import com.example.SiloeSoft.Servicios.EstudianteServicio;
import com.sun.jmx.snmp.ServiceName;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/estudiante")
public class EstudianteController {
    
    @Autowired
    private EstudianteServicio estudianteServicio;
    
    @PostMapping("/agregar")
    
    public ResponseEntity<Estudiante> guardar(@RequestBody Estudiante estudiante) {
        
        Estudiante obj = estudianteServicio.guardar(estudiante);
        
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }
    
    @DeleteMapping("borrar/{id}")
    public ResponseEntity<Estudiante> eliminar (@PathVariable Integer id) {
        Estudiante obj = estudianteServicio.encontrarPorId(id);
        
        if(obj != null) {
            estudianteServicio.borrar(id);
        }
        
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @PutMapping("editar/{id}")
    public ResponseEntity<Estudiante> editar(@RequestBody Estudiante estudiante, @PathVariable Integer id) {
        
        Estudiante obj = estudianteServicio.encontrarPorId(id);
        
        if (obj != null) {
            
            obj.setNombre(estudiante.getNombre());
            obj.setApellidos(estudiante.getApellidos());
            obj.setEmail(estudiante.getEmail());
            obj.setDireccion(estudiante.getDireccion());
            obj.setCelular(estudiante.getCelular());
            estudianteServicio.guardar(obj);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @GetMapping("/lista")
    public List<Estudiante> listarTodo() {
        return estudianteServicio.listarTodo();
    }
    
    @GetMapping("/lista/{id}")
    public Estudiante listarPorId (@PathVariable Integer id) {
        return estudianteServicio.encontrarPorId(id);
    }
}
