package com.proyecto.dawp.service;

import com.proyecto.dawp.domain.Perfil;
import java.util.List;

/**
 *
 * @author ferva
 */

public interface PerfilService {
    
    // Se obtiene un listado de perfiles en un List
    public List<Perfil> getPerfiles(boolean activos);
    
   // Se obtiene un Perfil, a partir del id de un perfil
    public Perfil getPerfil(Perfil perfil);
    
    // Se inserta un nuevo perfil si el id del perfil esta vacío
    // Se actualiza un perfil si el id del perfil NO esta vacío
    public void save(Perfil perfil);
    
    // Se elimina el perfil que tiene el id pasado por parámetro
    public void delete(Perfil perfil);
    
}
