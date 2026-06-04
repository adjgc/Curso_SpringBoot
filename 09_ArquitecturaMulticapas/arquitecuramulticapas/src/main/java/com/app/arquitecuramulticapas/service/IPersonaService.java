package com.app.arquitecuramulticapas.service;

import com.app.arquitecuramulticapas.model.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IPersonaService {
    
    //Metodos sin implementar
    public void crearPersona(Persona persona);
    public List<Persona> consultarPersonas();
    
}
