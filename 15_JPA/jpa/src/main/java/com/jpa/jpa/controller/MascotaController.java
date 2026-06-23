package com.jpa.jpa.controller;

import com.jpa.jpa.model.Mascota;
import com.jpa.jpa.service.IMascotaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MascotaController {
    
    private final IMascotaService mascotaService;
    
    @PostMapping("/mascota")
    public void savePersona(@RequestBody Mascota mascota){
        mascotaService.saveMascota(mascota);
    }
    
}
