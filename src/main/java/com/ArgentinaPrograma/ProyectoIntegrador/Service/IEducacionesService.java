package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Educaciones;
import java.util.List;
import java.util.Optional;

public interface IEducacionesService {
    public List<Educaciones> getEducacion();
    
    public Optional<Educaciones> getOneEducacion (Long id);
    
    public List<Educaciones> saveEducacion (Educaciones Edu);
    
    public List<Educaciones> deleteEducacion(Long id);
    
    public Educaciones findEducacion (Long id);
}