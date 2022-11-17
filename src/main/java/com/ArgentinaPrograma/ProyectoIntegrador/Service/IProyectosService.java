package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Proyectos;
import java.util.List;
import java.util.Optional;

public interface IProyectosService {
    public List<Proyectos> getProyectos();
    
    public Optional<Proyectos> getOneProyectos(Long id);
    
    public List<Proyectos> saveProyectos (Proyectos Proy);
    
    public List<Proyectos> deleteProyectos(Long id);
    
    public Proyectos findProyectos (Long id);
}
