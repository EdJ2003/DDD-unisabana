package com.example.DDDUnisabana.biblioteca.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    private int idEstudiante;
    private String nombre;
    private int semestre;
}
