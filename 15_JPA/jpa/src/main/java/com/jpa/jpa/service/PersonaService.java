package com.jpa.jpa.service;

import com.jpa.jpa.model.Persona;
import com.jpa.jpa.repository.PersonaRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonaService implements IPersonaService{
    
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = personaRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona getPersona(Long id) {
        Persona persona = personaRepository.findById(id).orElse(null);
        return persona;
    }

    @Override
    public void editPersona(Long idOriginal, Long idNuevo, String nuevoNombre, String nuevoApellido, Integer nuevaEdad) {
        Persona persona = this.getPersona(idOriginal);
        persona.setId(idNuevo);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setEdad(nuevaEdad);
        this.savePersona(persona);
    }
    
}
