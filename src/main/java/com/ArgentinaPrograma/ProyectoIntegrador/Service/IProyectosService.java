package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Proyectos;
import java.util.List;

public interface IProyectosService {
    public List<Proyectos> getProyectos();
    
    public List<Proyectos> saveProyectos (Proyectos Proy);
    
    public List<Proyectos> deleteProyectos(Long id);
    
    public Proyectos findProyectos (Long id);
}
