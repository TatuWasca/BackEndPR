package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Repository.BannerRepository;
import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Banner;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerService implements IBannerService{
    
    @Autowired
    private BannerRepository BanRepository;
    
    @Override
    public List<Banner> getBanner() {
       List<Banner> listaBanner = BanRepository.findAll();
       return listaBanner;
    }
    
    @Override
    public Optional<Banner> getOneBanner(Long id){
        return BanRepository.findById(id);
    }
    
    @Override
    public List<Banner> saveBanner(Banner Ban){
        BanRepository.save(Ban);
        List<Banner> listaBanner = BanRepository.findAll();
        return listaBanner;
    }
    
    @Override
    public Banner findBanner(Long id){
        Banner Ban = BanRepository.findById(id).orElse(null);
        return Ban;
    }
}