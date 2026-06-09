package com.app.quintoejerciciointegrador.controller;

import com.app.quintoejerciciointegrador.model.Jugador;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JugadorController {
    
    @PostMapping("/jugadores")
    public double agregarJugadores(@RequestBody List<Jugador> listaJugadores){
        return listaJugadores.stream()
                .mapToDouble(Jugador::getEstatura)
                .average()
                .orElse(0.0);
    }
    
}
