package com.app.cursos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tema {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_tema;
    private String nombre;
    private String descripcion;
    
}
