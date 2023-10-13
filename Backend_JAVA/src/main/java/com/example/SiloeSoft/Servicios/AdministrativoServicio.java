package com.example.SiloeSoft.Servicios;


import com.example.SiloeSoft.Modelos.Administrativo;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Dani
 */
public interface AdministrativoServicio {
    
    public Administrativo guardar (Administrativo administrativo);
    public void borrar (Integer id);
    public Administrativo encontrarPorId(Integer id);
    public List<Administrativo> listarTodo();
}
