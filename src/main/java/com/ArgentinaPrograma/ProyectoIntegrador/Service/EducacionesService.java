package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Repository.EducacionesRepository;
import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Educaciones;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionesService implements IEducacionesService{
    
    @Autowired
    private EducacionesRepository EduRepository;
    
    @Override
    public List<Educaciones> getEducacion() {
       List<Educaciones> listaEducacion = EduRepository.findAll();
       return listaEducacion;
    }
    
    @Override
    public List<Educaciones> saveEducacion(Educaciones Edu){
        EduRepository.save(Edu);
        List<Educaciones> listaEducacion = EduRepository.findAll();
        return listaEducacion;
    }
    
    @Override
    public List<Educaciones> deleteEducacion(Long id){
        EduRepository.deleteById(id);
        List<Educaciones> listaEducacion = EduRepository.findAll();
        return listaEducacion;
    }
    
    @Override
    public Educaciones findEducacion(Long id){
        Educaciones Edu = EduRepository.findById(id).orElse(null);
        return Edu;
    }

}