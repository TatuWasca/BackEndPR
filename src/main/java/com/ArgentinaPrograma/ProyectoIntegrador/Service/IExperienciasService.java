package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Experiencias;
import java.util.List;

public interface IExperienciasService {
    public List<Experiencias> getExperiencia();
    
    public List<Experiencias> saveExperiencia (Experiencias Exp);
    
    public List<Experiencias> deleteExperiencia(Long id);
    
    public Experiencias findExperiencia (Long id);
}