package com.jpa.jpa.controller;

import com.jpa.jpa.model.Persona;
import com.jpa.jpa.service.IPersonaService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PersonaController {
    
    private IPersonaService personaService;
    
    @GetMapping("/persona/{id}")
    @ResponseBody
    public Persona getPersona(@PathVariable Long id){
        return personaService.getPersona(id);
    }
    
    @GetMapping("/personas")
    @ResponseBody
    public List<Persona> getPersonas(){
        return personaService.getPersonas();
    }
    
    @PostMapping("/persona")
    public void savePersona(@RequestBody Persona persona){
        personaService.savePersona(persona);
    }
    
    @DeleteMapping("/persona/{id}")
    public void deletePersona(@PathVariable Long id){
        personaService.deletePersona(id);
    }
    
    @PutMapping("/persona/{id}")
    public Persona editPersona(@PathVariable Long id, 
            @RequestParam(required=false, name ="id") Long nuevoId,
            @RequestParam(required=false, name ="nombre") String nuevoNombre,
            @RequestParam(required=false, name ="apellido") String nuevoApellido,
            @RequestParam(required=false, name ="edad") Integer nuevaEdad){
        personaService.editPersona(id, nuevoNombre, nuevoApellido, nuevaEdad);
        return personaService.getPersona(id);
    }
    
}
