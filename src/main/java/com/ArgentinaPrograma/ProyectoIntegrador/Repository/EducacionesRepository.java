package com.ArgentinaPrograma.ProyectoIntegrador.Repository;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Educaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EducacionesRepository extends JpaRepository <Educaciones, Long>{
    
}
