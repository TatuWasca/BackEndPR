package com.ArgentinaPrograma.ProyectoIntegrador.Controller;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Proyectos;
import com.ArgentinaPrograma.ProyectoIntegrador.Service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/Proyectos")
@CrossOrigin(origins = {"https://frontend-4b57b.web.app/","https://frontend-4b57b.firebaseapp.com/"})
public class ProyectosController {
    
    @Autowired
    private IProyectosService interProy;
    
    @GetMapping("/traer")
    public List<Proyectos> getProyectos(){
        return interProy.getProyectos();
    }
    
    @GetMapping("/detalles/{id}")
    public Proyectos getOneProyectos(@PathVariable("id") Long id){
        Proyectos proy = interProy.findProyectos(id);
        return proy;
    }
    
    @PostMapping("/crear")
    public void createProyectos(@RequestBody Proyectos Proy) {
        interProy.saveProyectos(Proy);
    }
    
    @DeleteMapping("/borrar/{id}")
    public List<Proyectos> deleteProyectos(@PathVariable Long id){
        interProy.deleteProyectos(id);
        return interProy.getProyectos();
    }
    
    @PutMapping("/editar/{id}")
    public Proyectos editProyectos(@PathVariable Long id,@RequestBody Proyectos detallesProy){
        
        Proyectos Proy = interProy.findProyectos(id);
        
        Proy.setNombre(detallesProy.getNombre());
        Proy.setDescripcion(detallesProy.getDescripcion());
        Proy.setLugar(detallesProy.getLugar());
        Proy.setFecha(detallesProy.getFecha());
        Proy.setUrl(detallesProy.getUrl());
                
        interProy.saveProyectos(Proy);
        return Proy;
    }
}