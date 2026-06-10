package com.app.sextoejerciciointegrador.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaTrianguloController {
    
    @GetMapping("/triangulo")
    public double calcularArea(
            @RequestParam double base,
            @RequestParam double altura){
        return (base*altura)/2;
    }
    
}
