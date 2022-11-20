package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Acercade;
import java.util.List;
import java.util.Optional;

public interface IAcercadeService {
    public List<Acercade> getAcercade();
    
    public void saveAcercade (Acercade AcDe);
    
    public Acercade findAcercade (Long id);
}
