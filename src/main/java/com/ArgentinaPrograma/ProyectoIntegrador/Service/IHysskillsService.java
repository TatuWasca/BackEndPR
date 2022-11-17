package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Hysskills;
import java.util.List;
import java.util.Optional;

public interface IHysskillsService {
    public List<Hysskills> getHysskills();
    
    public Optional<Hysskills> getOneHysskills(Long id);
    
    public List<Hysskills> saveHysskills (Hysskills skill);
    
    public List<Hysskills> deleteHysskills(Long id);
    
    public Hysskills findHysskills (Long id);
}