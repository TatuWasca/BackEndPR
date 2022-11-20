package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Repository.AcercadeRepository;
import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Acercade;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercadeService implements IAcercadeService{
    
    @Autowired
    private AcercadeRepository AcDeRepository;
    
    @Override
    public List<Acercade> getAcercade() {
       List<Acercade> listaAcercaDe = AcDeRepository.findAll();
       return listaAcercaDe;
    }
    
    @Override
    public void saveAcercade(Acercade AcDe){
        AcDeRepository.save(AcDe);
    }
    
    @Override
    public Acercade findAcercade(Long id){
        Acercade AcDe = AcDeRepository.findById(id).orElse(null);
        return AcDe;
    }
}