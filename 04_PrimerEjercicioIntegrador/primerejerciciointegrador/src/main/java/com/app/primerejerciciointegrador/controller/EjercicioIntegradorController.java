package com.app.primerejerciciointegrador.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjercicioIntegradorController {
    
    @GetMapping("/convertir/{galones}")
    public String galonesALitros(@PathVariable double galones){
        double litros = galones * 3.78541;
        return galones + " galones equivalen a " + litros + " litros.";
    }
    
}
