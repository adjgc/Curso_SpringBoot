package com.app.patrondto.controller;

import com.app.patrondto.model.Inquilino;
import com.app.patrondto.model.Propiedad;
import com.app.patrondto.model.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dtoController {
    
    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad(@PathVariable long id){
        Propiedad propiedad = new Propiedad(12345L, "Casa", "Avenida siempre viva", 240.0, 300.0);
        Inquilino inquilino = new Inquilino(1L, "Walter", "White", "Profesor de química");
        PropiedadDTO propiedadDTO = new PropiedadDTO();
        propiedadDTO.setIdPropiedad(propiedad.getIdPropiedad());
        propiedadDTO.setTipoPropiedad(propiedad.getTipoPropiedad());
        propiedadDTO.setDireccion(propiedad.getDireccion());
        propiedadDTO.setValorAlquiler(propiedad.getValorAlquiler());
        propiedadDTO.setNombre(inquilino.getNombre());
        propiedadDTO.setApellido(inquilino.getApellido());
        return propiedadDTO;
    }
    
}
