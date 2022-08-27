package com.ArgentinaPrograma.ProyectoIntegrador.Controller;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Educaciones;
import com.ArgentinaPrograma.ProyectoIntegrador.Service.IEducacionesService;
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
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionesController {
    
    @Autowired
    private IEducacionesService interEdu;
    
    @GetMapping("/Educaciones/traer")
    public List<Educaciones> getEducacion(){
        return interEdu.getEducacion();
    }

    @PostMapping("/Educaciones/crear")
    public List<Educaciones> createEducacion(@RequestBody Educaciones Edu) {
        interEdu.saveEducacion(Edu);
        return interEdu.getEducacion();
    }

    @DeleteMapping("/Educaciones/borrar/{id}")
    public List<Educaciones> deleteEducacion(@PathVariable Long id){
        interEdu.deleteEducacion(id);
        return interEdu.getEducacion();
    }

    @PutMapping("/Educaciones/editar/{id}")
    public List<Educaciones> editEducacion(@PathVariable Long id,@RequestBody Educaciones detallesEdu){
        
        Educaciones Edu = interEdu.findEducacion(id);
        
        Edu.setNombre(detallesEdu.getNombre());
        Edu.setDescripcion(detallesEdu.getDescripcion());
        Edu.setLugar(detallesEdu.getLugar());
        Edu.setFecha(detallesEdu.getFecha());
                
        interEdu.saveEducacion(Edu);
        return interEdu.getEducacion();
    }
}