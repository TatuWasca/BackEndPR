package com.ArgentinaPrograma.ProyectoIntegrador.Service;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Banner;
import java.util.List;

public interface IBannerService {
    public List<Banner> getBanner();
    
    public void saveBanner (Banner Ban);

    public Banner findBanner (Long id);
}
