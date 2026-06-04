package com.app.patrondto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inquilino {
    
    private long idIndquilino;
    private String nombre;
    private String apellido;
    private String profesion;
    
}
