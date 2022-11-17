package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Banner;
import java.util.List;
import java.util.Optional;

public interface IBannerService {
    public List<Banner> getBanner();
    
    public Optional<Banner> getOneBanner (Long id);
    
    public List<Banner> saveBanner (Banner Ban);

    public Banner findBanner (Long id);
}
