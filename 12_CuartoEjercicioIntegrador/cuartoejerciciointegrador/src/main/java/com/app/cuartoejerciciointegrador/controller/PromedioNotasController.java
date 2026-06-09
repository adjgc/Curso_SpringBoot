package com.app.cuartoejerciciointegrador.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromedioNotasController {
    
    @GetMapping("/promedio")
    public double obtenerPromedio(
            @RequestParam double nota1,
            @RequestParam double nota2,
            @RequestParam double nota3){
        return (nota1 + nota2 + nota3)/3;
    }
    
}
