package com.ArgentinaPrograma.ProyectoIntegrador.Controller;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Experiencias;
import com.ArgentinaPrograma.ProyectoIntegrador.Service.IExperienciasService;
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
@RequestMapping("/Experiencias")
@CrossOrigin(origins = {"https://frontend-4b57b.web.app","https://frontend-4b57b.firebaseapp.com/"})
public class ExperienciasController {
    
    @Autowired
    private IExperienciasService interExp;
    
    @GetMapping("/traer")
    public List<Experiencias> getExperiencia(){
        return interExp.getExperiencia();
    }
    
    @GetMapping("/detalles/{id}")
    public Experiencias getOneExperiencia(@PathVariable("id") Long id){
        Experiencias exp = interExp.getOneExperiencia(id).get();
        return exp;
    }

    @PostMapping("/crear")
    public List<Experiencias> createExperiencia(@RequestBody Experiencias Exp) {
        interExp.saveExperiencia(Exp);
        return interExp.getExperiencia();
    }

    @DeleteMapping("/borrar/{id}")
    public List<Experiencias> deleteExperiencia(@PathVariable Long id){
        interExp.deleteExperiencia(id);
        return interExp.getExperiencia();
    }

    @PutMapping("/editar/{id}")
    public List<Experiencias> editExperiencia(@PathVariable Long id,@RequestBody Experiencias detallesExp){
        
        Experiencias Exp = interExp.findExperiencia(id);
        
        Exp.setNombre(detallesExp.getNombre());
        Exp.setDescripcion(detallesExp.getDescripcion());
        Exp.setLugar(detallesExp.getLugar());
        Exp.setFecha(detallesExp.getFecha());
                
        interExp.saveExperiencia(Exp);
        return interExp.getExperiencia();
    }
}