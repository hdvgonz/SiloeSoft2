package com.example.SiloeSoft.Servicios;


import com.example.SiloeSoft.Modelos.Tutor;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Dani
 */
public interface TutorServicio {
    
    public Tutor guardar (Tutor tutor);
    public void borrar (Integer id);
    public Tutor encontrarPorId(Integer id);
    public List<Tutor> listarTodo();
}
