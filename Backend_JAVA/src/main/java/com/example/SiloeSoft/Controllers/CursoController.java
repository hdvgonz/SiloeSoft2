/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SiloeSoft.Controllers;

import com.example.SiloeSoft.Modelos.Curso;
import com.example.SiloeSoft.Servicios.CursoServicio;
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
@RequestMapping(path ="curso")
public class CursoController {
    
    @Autowired
    private CursoServicio cursoServicio;
    
    @PostMapping("/agregar")
    public ResponseEntity<Curso> guardar (@RequestBody Curso curso) {
        
      Curso obj = cursoServicio.guardar(curso);
      
      return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }
    
    @DeleteMapping("borrar/{id}")
    public ResponseEntity<Curso> borrar (@PathVariable Integer id) {
        Curso obj = cursoServicio.encontrarPorId(id);
        
        if (obj != null) {
            cursoServicio.borrar(id);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @GetMapping("/lista/{id}")
    public Curso listarPorId(@PathVariable Integer id) {
        return cursoServicio.encontrarPorId(id);
    }
    
    @GetMapping("lista")
    public List<Curso> listarTodo() {
        return cursoServicio.listarTodo();
    }
}
