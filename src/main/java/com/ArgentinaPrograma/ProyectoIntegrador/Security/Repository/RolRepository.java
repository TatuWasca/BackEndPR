package com.ArgentinaPrograma.ProyectoIntegrador.Security.Repository;

import com.ArgentinaPrograma.ProyectoIntegrador.Security.Entity.Rol;
import com.ArgentinaPrograma.ProyectoIntegrador.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
