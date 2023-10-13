package com.example.SiloeSoft.Servicios;


import com.example.SiloeSoft.Modelos.Estudiante;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Dani
 */
public interface EstudianteServicio {
    
    public Estudiante guardar (Estudiante estudiante);
    public void borrar (Integer id);
    public Estudiante encontrarPorId (Integer id);
    public List<Estudiante> listarTodo();
    
}
