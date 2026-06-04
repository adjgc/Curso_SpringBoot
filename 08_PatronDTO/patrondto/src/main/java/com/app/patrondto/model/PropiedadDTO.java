package com.app.patrondto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropiedadDTO {
    
    private long idPropiedad;
    private String tipoPropiedad;
    private String direccion;
    private Double valorAlquiler;
    private String nombre;
    private String apellido;
    
}
