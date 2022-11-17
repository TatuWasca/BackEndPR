package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Experiencias;
import java.util.List;
import java.util.Optional;

public interface IExperienciasService {
    public List<Experiencias> getExperiencia();
    
    public Optional<Experiencias> getOneExperiencia (Long id);
    
    public List<Experiencias> saveExperiencia (Experiencias Exp);
    
    public List<Experiencias> deleteExperiencia(Long id);
    
    public Experiencias findExperiencia (Long id);
}