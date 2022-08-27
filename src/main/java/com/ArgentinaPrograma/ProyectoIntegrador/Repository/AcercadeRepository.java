package com.ArgentinaPrograma.ProyectoIntegrador.Repository;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Acercade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AcercadeRepository extends JpaRepository <Acercade, Long>{
    
}
