package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Repository.ProyectosRepository;
import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Proyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{
    
    @Autowired
    private ProyectosRepository ProyRepository;
    
    @Override
    public List<Proyectos> getProyectos() {
       List<Proyectos> listaProyectos = ProyRepository.findAll();
       return listaProyectos;
    }
    
    @Override
    public List<Proyectos> saveProyectos(Proyectos Proy){
        ProyRepository.save(Proy);
        List<Proyectos> listaProyectos = ProyRepository.findAll();
        return listaProyectos;
    }
    
    @Override
    public List<Proyectos> deleteProyectos(Long id){
        ProyRepository.deleteById(id);
        List<Proyectos> listaProyectos = ProyRepository.findAll();
        return listaProyectos;
    }
    
    @Override
    public Proyectos findProyectos(Long id){
        Proyectos Proy = ProyRepository.findById(id).orElse(null);
        return Proy;
    }

}