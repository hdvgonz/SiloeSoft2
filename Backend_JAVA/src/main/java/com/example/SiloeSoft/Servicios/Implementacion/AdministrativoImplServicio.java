/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SiloeSoft.Servicios.Implementacion;

import com.example.SiloeSoft.DAO.AdministrativoDao;
import com.example.SiloeSoft.Modelos.Administrativo;
import com.example.SiloeSoft.Servicios.AdministrativoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdministrativoImplServicio implements AdministrativoServicio {

    @Autowired

    private AdministrativoDao admDao;

    @Override
    @Transactional(readOnly = false)
    public Administrativo guardar(Administrativo adm) {
        return admDao.save(adm);
    }

    @Override
    @Transactional(readOnly = false)
    public void borrar(Integer id) {
        admDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Administrativo encontrarPorId(Integer id) {
        return admDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Administrativo> listarTodo() {
        return (List<Administrativo>) admDao.findAll();
    }

}
