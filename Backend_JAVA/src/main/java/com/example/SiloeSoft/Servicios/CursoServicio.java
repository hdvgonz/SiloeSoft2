/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.SiloeSoft.Servicios;

import com.example.SiloeSoft.Modelos.Curso;
import java.util.List;

/**
 *
 * @author Dani
 */
public interface CursoServicio {
    public Curso guardar (Curso curso);
    public void borrar (Integer id);
    public Curso encontrarPorId (Integer id);
    public List<Curso> listarTodo();
    
}
