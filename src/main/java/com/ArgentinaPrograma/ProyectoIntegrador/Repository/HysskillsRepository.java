package com.ArgentinaPrograma.ProyectoIntegrador.Repository;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Hysskills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HysskillsRepository extends JpaRepository <Hysskills, Long>{
    
}
