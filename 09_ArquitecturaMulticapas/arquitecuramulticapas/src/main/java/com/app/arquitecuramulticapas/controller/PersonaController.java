package com.app.arquitecuramulticapas.controller;

import com.app.arquitecuramulticapas.model.Persona;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @PostMapping("/persona")
    public void crearPersona(@RequestBody Persona persona){
        
    }
    
    @GetMapping("/personas")
    public List<Persona> consultarPersonas(){
        return null;
    }
    
}
