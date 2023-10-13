/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SiloeSoft.Servicios.Implementacion;

import com.example.SiloeSoft.DAO.CursoDao;
import com.example.SiloeSoft.Modelos.Curso;
import com.example.SiloeSoft.Servicios.CursoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CursoImplServicio implements CursoServicio{
    
    @Autowired
    
    private CursoDao cursoDao;
    
    @Override
    @Transactional(readOnly = false)
    public Curso guardar (Curso curso) {
        return cursoDao.save(curso);
    }
    @Override
    @Transactional(readOnly = false)
    public void borrar (Integer id) {
        cursoDao.deleteById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Curso encontrarPorId (Integer id) {
        return cursoDao.findById(id).orElse(null);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Curso> listarTodo() {
        return (List<Curso>) cursoDao.findAll();
    }
    
}
