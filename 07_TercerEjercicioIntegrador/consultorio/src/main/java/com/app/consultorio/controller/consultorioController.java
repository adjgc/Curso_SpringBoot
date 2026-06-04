package com.app.consultorio.controller;

import com.app.consultorio.model.Paciente;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class consultorioController {
    
    @GetMapping("/pacientes")
    @ResponseBody
    public List<Paciente> consultarPacientes(){
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente(1, "Carlos", "López", LocalDate.of(1990, 5, 15)));
        pacientes.add(new Paciente(2, "María", "García", LocalDate.of(1985, 8, 22)));
        pacientes.add(new Paciente(3, "Jorge", "Pérez", LocalDate.of(2000, 11, 10)));
        pacientes.add(new Paciente(4, "Lucía", "Fernández", LocalDate.of(2015, 3, 5)));
        pacientes.add(new Paciente(5, "Mateo", "Ruiz", LocalDate.of(2012, 7, 20)));
        return pacientes;
    }
    
    @GetMapping("/pacientes/menores")
    @ResponseBody
    public List<Paciente> consultarPacientesMenores(){
        List<Paciente> pacientes = new ArrayList<>();
        List<Paciente> menores = new ArrayList<>();
        pacientes.add(new Paciente(1, "Carlos", "López", LocalDate.of(1990, 5, 15)));
        pacientes.add(new Paciente(2, "María", "García", LocalDate.of(1985, 8, 22)));
        pacientes.add(new Paciente(3, "Jorge", "Pérez", LocalDate.of(2000, 11, 10)));
        pacientes.add(new Paciente(4, "Lucía", "Fernández", LocalDate.of(2015, 3, 5)));
        pacientes.add(new Paciente(5, "Mateo", "Ruiz", LocalDate.of(2012, 7, 20)));
        for(Paciente paciente : pacientes){
            if(Period.between(paciente.getFechaNacimiento(), LocalDate.now()).getYears() < 18){
                menores.add(paciente);
            }
        }
        return menores;
    }
    
}
