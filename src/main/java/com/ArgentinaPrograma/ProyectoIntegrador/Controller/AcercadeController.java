package com.ArgentinaPrograma.ProyectoIntegrador.Controller;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Acercade;
import com.ArgentinaPrograma.ProyectoIntegrador.Service.IAcercadeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://frontend-4b57b.web.app")
public class AcercadeController {
    
    @Autowired
    private IAcercadeService interAcDe;
    
    @GetMapping("/Acercade/traer")
    public List<Acercade> getAcercade(){
        return interAcDe.getAcercade();
    }

    @PutMapping("/Acercade/editar/{id}")
    public List<Acercade> editAcercade(@PathVariable Long id,@RequestBody Acercade detallesAcDe){
        
        Acercade AcDe = interAcDe.findAcercade(id);

        AcDe.setDescripcion(detallesAcDe.getDescripcion());

        interAcDe.saveAcercade(AcDe);
        return interAcDe.getAcercade();
    }
}