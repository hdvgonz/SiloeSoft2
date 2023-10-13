/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SiloeSoft.Controllers;

import com.example.SiloeSoft.Modelos.Tutor;
import com.example.SiloeSoft.Servicios.TutorServicio;
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
@RequestMapping(path = "/tutor")
public class TutorController {

    @Autowired
    private TutorServicio tutorServicio;

    @PostMapping("/agregar")
    public ResponseEntity<Tutor> guardar(@RequestBody Tutor tutor) {

        //Recordar: intenta probar con un if(obj != null)
        Tutor obj = tutorServicio.guardar(tutor);
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<Tutor> borrar(@PathVariable Integer id) {

        Tutor obj = tutorServicio.encontrarPorId(id);

        if (obj != null) {
            tutorServicio.borrar(id);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);

    }

    @PostMapping("editar/{id}")
    public ResponseEntity<Tutor> editar(@RequestBody Tutor tutor, @PathVariable Integer id) {

        Tutor obj = tutorServicio.encontrarPorId(id);

        if (obj != null) {
            obj.setNombre(tutor.getNombre());
            obj.setDireccion(tutor.getDireccion());
            obj.setEmail(tutor.getEmail());
            obj.setCelular(tutor.getCelular());
            tutorServicio.guardar(obj);

        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @GetMapping("/lista")
    public List<Tutor> listarTodo(){
        return (List<Tutor>) tutorServicio.listarTodo();
    }
    
    @GetMapping("lista/{id}")
    public Tutor listarPorId (@PathVariable Integer id) {
        return  tutorServicio.encontrarPorId(id);
    }
}
