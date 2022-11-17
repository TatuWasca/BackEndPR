package com.ArgentinaPrograma.ProyectoIntegrador.Controller;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Educaciones;
import com.ArgentinaPrograma.ProyectoIntegrador.Service.IEducacionesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/Educaciones")
@CrossOrigin(origins = {"https://frontend-4b57b.web.app","https://frontend-4b57b.firebaseapp.com/"})
public class EducacionesController {
    
    @Autowired
    private IEducacionesService interEdu;
    
    @GetMapping("/traer")
    public List<Educaciones> getEducacion(){
        return interEdu.getEducacion();
    }
     
    @GetMapping("/detalles/{id}")
    public Educaciones getOneEducacion(@PathVariable("id") Long id){
        Educaciones edu = interEdu.getOneEducacion(id).get();
        return edu;
    }
    
    @PostMapping("/crear")
    public List<Educaciones> createEducacion(@RequestBody Educaciones Edu) {
        interEdu.saveEducacion(Edu);
        return interEdu.getEducacion();
    }

    @DeleteMapping("/borrar/{id}")
    public List<Educaciones> deleteEducacion(@PathVariable Long id){
        interEdu.deleteEducacion(id);
        return interEdu.getEducacion();
    }

    @PutMapping("/editar/{id}")
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