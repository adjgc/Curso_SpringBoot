package com.jpa.jpa.service;

import com.jpa.jpa.model.Persona;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.jpa.jpa.repository.IPersonaRepository;

@Service
@AllArgsConstructor
public class PersonaService implements IPersonaService{
    
    private IPersonaRepository personaRepository;

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
    public void editPersona(Long idOriginal, String nuevoNombre, String nuevoApellido, Integer nuevaEdad) {
        Persona persona = this.getPersona(idOriginal);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setEdad(nuevaEdad);
        this.savePersona(persona);
    }

    @Override
    public void editPersona(Persona persona) {
        this.savePersona(persona);
    }
    
}
