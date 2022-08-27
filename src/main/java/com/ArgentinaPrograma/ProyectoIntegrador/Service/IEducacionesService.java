package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Educaciones;
import java.util.List;

public interface IEducacionesService {
    public List<Educaciones> getEducacion();
    
    public List<Educaciones> saveEducacion (Educaciones Edu);
    
    public List<Educaciones> deleteEducacion(Long id);
    
    public Educaciones findEducacion (Long id);
}