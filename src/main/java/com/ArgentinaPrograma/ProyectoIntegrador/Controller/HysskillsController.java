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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hysskills")
@CrossOrigin(origins = {"https://frontend-4b57b.web.app","https://frontend-4b57b.firebaseapp.com/"})
public class HysskillsController {
    
    @Autowired
    private IHysskillsService interSkill;
    
    @GetMapping("/traer")
    public List<Hysskills> getHysskills(){
        return interSkill.getHysskills();
    }
    
    @GetMapping("/detalles/{id}")
    public Hysskills getOneHysskills(@PathVariable("id") Long id){
        Hysskills skill = interSkill.findHysskills(id);
        return skill;
    }
    
    @PostMapping("/crear")
    public void createHysskills(@RequestBody Hysskills skill) {
        interSkill.saveHysskills(skill);
    }
    
    @DeleteMapping("/borrar/{id}")
    public List<Hysskills> deleteHysskills(@PathVariable Long id){
        interSkill.deleteHysskills(id);
        return interSkill.getHysskills();
    }
    
    @PutMapping("/editar/{id}")
    public Hysskills editHysskills(@PathVariable Long id,@RequestBody Hysskills detallesSkill){
        
        Hysskills skill = interSkill.findHysskills(id);
        
        skill.setNombre(detallesSkill.getNombre());
        skill.setValor(detallesSkill.getValor());
                
        interSkill.saveHysskills(skill);
        return skill;
    }
}