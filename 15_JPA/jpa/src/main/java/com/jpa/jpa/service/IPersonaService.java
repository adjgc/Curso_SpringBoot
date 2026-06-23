package com.jpa.jpa.service;

import com.jpa.jpa.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> getPersonas();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona getPersona(Long id);
    
    public void editPersona(Long idOriginal, String nuevoNombre, String nuevoApellido, Integer nuevaEdad);

    public void editPersona(Persona persona);
    
}
