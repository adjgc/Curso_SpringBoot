package com.app.consultorio.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {
    
    private int id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    
}
