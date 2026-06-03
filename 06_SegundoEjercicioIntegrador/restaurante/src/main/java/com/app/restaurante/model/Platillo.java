package com.app.restaurante.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Platillo {
    
    private int id;
    private String nombre;
    private double precio;
    private String descripcion;
    
}
