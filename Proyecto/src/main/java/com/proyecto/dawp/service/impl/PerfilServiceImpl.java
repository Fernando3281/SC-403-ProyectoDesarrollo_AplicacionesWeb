package com.proyecto.dawp.service.impl;

import com.proyecto.dawp.dao.PerfilDao;
import com.proyecto.dawp.domain.Perfil;
import com.proyecto.dawp.service.PerfilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ferva
 */

@Service
public class PerfilServiceImpl implements PerfilService {
    
    @Autowired
    private PerfilDao perfilDao;

    @Override
    @Transactional(readOnly = true)
    public List<Perfil> getPerfiles(boolean activos) {
        var lista = perfilDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Perfil getPerfil(Perfil perfil) {
        return perfilDao.findById(perfil.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Perfil perfil) {
        perfilDao.save(perfil);
    }

    @Override
    @Transactional
    public void delete(Perfil perfil) {
        perfilDao.delete(perfil);
    }
    
}
