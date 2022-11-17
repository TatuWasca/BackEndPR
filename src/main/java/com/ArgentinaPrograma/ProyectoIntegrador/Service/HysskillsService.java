package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Repository.HysskillsRepository;
import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Hysskills;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HysskillsService implements IHysskillsService{
    
    @Autowired
    private HysskillsRepository skillRepository;
    
    @Override
    public List<Hysskills> getHysskills() {
       List<Hysskills> listaHysskills = skillRepository.findAll();
       return listaHysskills;
    }
    
    @Override
    public Optional<Hysskills> getOneHysskills(Long id){
        return skillRepository.findById(id);
    }
    
    @Override
    public List<Hysskills> saveHysskills(Hysskills skill){
        skillRepository.save(skill);
        List<Hysskills> listaHysskills = skillRepository.findAll();
        return listaHysskills; 
    }
    
    @Override
    public List<Hysskills> deleteHysskills(Long id){
        skillRepository.deleteById(id);
        List<Hysskills> listaHysskills = skillRepository.findAll();
        return listaHysskills;
    }
    
    @Override
    public Hysskills findHysskills(Long id){
        Hysskills skill = skillRepository.findById(id).orElse(null);
        return skill;
    }

}