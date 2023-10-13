/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.SiloeSoft.DAO;

import com.example.SiloeSoft.Modelos.Estudiante;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Dani
 */
public interface EstudianteDao extends CrudRepository<Estudiante, Integer>{
    
}
