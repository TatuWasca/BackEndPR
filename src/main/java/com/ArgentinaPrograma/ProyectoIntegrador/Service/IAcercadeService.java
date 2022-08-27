package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Acercade;
import java.util.List;

public interface IAcercadeService {
    public List<Acercade> getAcercade();
    
    public List<Acercade> saveAcercade (Acercade AcDe);
    
    public Acercade findAcercade (Long id);
}
