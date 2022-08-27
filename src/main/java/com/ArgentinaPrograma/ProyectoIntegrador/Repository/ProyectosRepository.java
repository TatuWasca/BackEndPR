package com.ArgentinaPrograma.ProyectoIntegrador.Repository;

import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProyectosRepository extends JpaRepository <Proyectos, Long>{
    
}