package com.ArgentinaPrograma.ProyectoIntegrador.Controller;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Banner;
import com.ArgentinaPrograma.ProyectoIntegrador.Service.IBannerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Banner")
@CrossOrigin(origins = {"https://frontend-4b57b.web.app","https://frontend-4b57b.firebaseapp.com/"})
public class BannerController {
    
    @Autowired
    private IBannerService interBan;
    
    @GetMapping("/traer")
    public List<Banner> getBanner(){
        return interBan.getBanner();
    }
    
    @GetMapping("/detalles/{id}")
    public Banner getOneBanner(@PathVariable("id") Long id){
        Banner ban = interBan.findBanner(id);
        return ban;
    }
    
    @PutMapping("/editar/{id}")
    public Banner editBanner(@PathVariable Long id,@RequestBody Banner detallesBan){
        
        Banner Ban = interBan.findBanner(id);
        
        Ban.setNombre(detallesBan.getNombre());
        Ban.setDescripcion(detallesBan.getDescripcion());
        Ban.setLocalidad(detallesBan.getLocalidad());
        
        interBan.saveBanner(Ban);
        return Ban;
    }
}