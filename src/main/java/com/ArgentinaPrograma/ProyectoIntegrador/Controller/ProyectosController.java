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
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"https://frontend-4b57b.web.app","https://frontend-4b57b.firebaseapp.com/"})
public class ProyectosController {
    
    @Autowired
    private IProyectosService interProy;
    
    @GetMapping("/Proyectos/traer")
    public List<Proyectos> getProyectos(){
        return interProy.getProyectos();
    }
    
    @PostMapping("/Proyectos/crear")
    public List<Proyectos> createProyectos(@RequestBody Proyectos Proy) {
        interProy.saveProyectos(Proy);
        return interProy.getProyectos();
    }
    
    @DeleteMapping("/Proyectos/borrar/{id}")
    public List<Proyectos> deleteProyectos(@PathVariable Long id){
        interProy.deleteProyectos(id);
        return interProy.getProyectos();
    }
    
    @PutMapping("/Proyectos/editar/{id}")
    public List<Proyectos> editProyectos(@PathVariable Long id,@RequestBody Proyectos detallesProy){
        
        Proyectos Proy = interProy.findProyectos(id);
        
        Proy.setNombre(detallesProy.getNombre());
        Proy.setDescripcion(detallesProy.getDescripcion());
        Proy.setLugar(detallesProy.getLugar());
        Proy.setFecha(detallesProy.getFecha());
                
        interProy.saveProyectos(Proy);
        return interProy.getProyectos();
    }
}