package com.ArgentinaPrograma.ProyectoIntegrador.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Banner{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_Usuario_Banner;
    private String nombre;
    private String localidad;
    private String descripcion;
}
