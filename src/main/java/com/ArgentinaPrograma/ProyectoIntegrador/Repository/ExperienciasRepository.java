package com.ArgentinaPrograma.ProyectoIntegrador.Repository;
import com.ArgentinaPrograma.ProyectoIntegrador.Entity.Experiencias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciasRepository extends JpaRepository <Experiencias, Long>{
    
}
