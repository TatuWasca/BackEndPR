package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Repository.ExperienciasRepository;
import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Experiencias;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciasService implements IExperienciasService{
    
    @Autowired
    private ExperienciasRepository ExpRepository;
    
    @Override
    public List<Experiencias> getExperiencia() {
       List<Experiencias> listaExperiencias = ExpRepository.findAll();
       return listaExperiencias;
    }
    
    @Override
    public void saveExperiencia(Experiencias Exp){
        ExpRepository.save(Exp);
    }
    
    @Override
    public List<Experiencias> deleteExperiencia(Long id){
        ExpRepository.deleteById(id);
        List<Experiencias> listaExperiencias = ExpRepository.findAll();
        return listaExperiencias;
    }
    
    @Override
    public Experiencias findExperiencia(Long id){
        Experiencias Exp = ExpRepository.findById(id).orElse(null);
        return Exp;
    }

}