package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Repository.EducacionesRepository;
import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Educaciones;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionesService implements IEducacionesService {
    @Autowired
    private EducacionesRepository EduRepository;
    
    @Override
    public List<Educaciones> getEducacion() {
       List<Educaciones> listaExperiencias = EduRepository.findAll();
       return listaExperiencias;
    }
    
    @Override
    public void saveEducacion(Educaciones Edu){
        EduRepository.save(Edu);
    }
    
    @Override
    public List<Educaciones> deleteEducacion(Long id){
        EduRepository.deleteById(id);
        List<Educaciones> listaEducaciones = EduRepository.findAll();
        return listaEducaciones;
    }
    
    @Override
    public Educaciones findEducacion(Long id){
        Educaciones Edu = EduRepository.findById(id).orElse(null);
        return Edu;
    }

}