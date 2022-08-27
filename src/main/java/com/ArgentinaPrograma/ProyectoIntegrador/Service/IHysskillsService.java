package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Hysskills;
import java.util.List;

public interface IHysskillsService {
    public List<Hysskills> getHysskills();
    
    public List<Hysskills> saveHysskills (Hysskills skill);
    
    public List<Hysskills> deleteHysskills(Long id);
    
    public Hysskills findHysskills (Long id);
}