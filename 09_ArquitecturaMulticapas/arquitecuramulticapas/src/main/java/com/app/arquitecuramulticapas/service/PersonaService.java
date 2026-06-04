package com.app.arquitecuramulticapas.service;

import com.app.arquitecuramulticapas.model.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    //Implementacion de metodos de logica de negocio
    @Override
    public void crearPersona(Persona persona) {
        System.out.println("Persona creada");
    }

    @Override
    public List<Persona> consultarPersonas() {
        System.out.println("Se devuelve la lista de personas");
        return null;
    }
    
}
