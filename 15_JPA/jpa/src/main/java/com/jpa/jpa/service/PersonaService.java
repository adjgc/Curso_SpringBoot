package com.jpa.jpa.service;

import com.jpa.jpa.repository.PersonaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonaService {
    
    private PersonaRepository personaRepository;
    
}
