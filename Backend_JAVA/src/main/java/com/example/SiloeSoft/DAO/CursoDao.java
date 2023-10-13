/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.SiloeSoft.DAO;

import com.example.SiloeSoft.Modelos.Curso;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Dani
 */
public interface CursoDao extends CrudRepository<Curso , Integer> {
    
}
