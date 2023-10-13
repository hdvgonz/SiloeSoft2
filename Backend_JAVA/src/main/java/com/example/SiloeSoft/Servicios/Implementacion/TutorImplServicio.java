/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SiloeSoft.Servicios.Implementacion;

import com.example.SiloeSoft.DAO.TutorDao;
import com.example.SiloeSoft.Modelos.Tutor;
import com.example.SiloeSoft.Servicios.TutorServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class TutorImplServicio implements TutorServicio {

    @Autowired
    private TutorDao tutorDao;

    @Override
    @Transactional(readOnly = false)
    public Tutor guardar(Tutor tutor) {
        return tutorDao.save(tutor);
    }

    @Override
    @Transactional(readOnly = false)
    public void borrar(Integer id) {
        tutorDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Tutor encontrarPorId(Integer id) {
        return tutorDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Tutor> listarTodo() {
        return (List<Tutor>) tutorDao.findAll();
    }
}
