package com.app.metodopost.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cliente {
    
    private long id;
    private String nombre;
    private String apellido;
    
}
