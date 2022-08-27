package com.ArgentinaPrograma.ProyectoIntegrador.Controller;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Hysskills;
import com.ArgentinaPrograma.ProyectoIntegrador.Service.IHysskillsService;
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
public class HysskillsController {
    
    @Autowired
    private IHysskillsService interSkill;
    
    @GetMapping("/Hysskills/traer")
    public List<Hysskills> getHysskills(){
        return interSkill.getHysskills();
    }
    
    @PostMapping("/Hysskills/crear")
    public List<Hysskills> createHysskills(@RequestBody Hysskills skill) {
        interSkill.saveHysskills(skill);
        return interSkill.getHysskills();
    }
    
    @DeleteMapping("/Hysskills/borrar/{id}")
    public List<Hysskills> deleteHysskills(@PathVariable Long id){
        interSkill.deleteHysskills(id);
        return interSkill.getHysskills();
    }
    
    @PutMapping("/Hysskills/editar/{id}")
    public List<Hysskills> editHysskills(@PathVariable Long id,@RequestBody Hysskills detallesSkill){
        
        Hysskills skill = interSkill.findHysskills(id);
        
        skill.setNombre(detallesSkill.getNombre());
        skill.setValor(detallesSkill.getValor());
                
        interSkill.saveHysskills(skill);
        return interSkill.getHysskills();
    }
}