package com.app.metodopost.controller;

import com.app.metodopost.model.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetodoPostController {
    
    @PostMapping("/cliente")
    public void crearCliente(@RequestBody Cliente cliente){
        System.out.println("Cliente creado");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Apellido: " + cliente.getApellido());
    }
    
}
