package com.ArgentinaPrograma.ProyectoIntegrador.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_Proyecto;
    private String nombre;
    private String descripcion;
    private String lugar;
    private String fecha;
    private String url;
}
