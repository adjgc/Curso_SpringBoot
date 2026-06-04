package com.app.arquitecuramulticapas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    
    private long id;
    private String nombre;
    private String apellido;
    
}
