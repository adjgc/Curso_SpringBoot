package com.app.patrondto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Propiedad {
    
    private long idPropiedad;
    private String tipoPropiedad;
    private String direccion;
    private Double metrosCuadrados;
    private Double valorAlquiler;
    
}
