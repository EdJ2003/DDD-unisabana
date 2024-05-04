package com.example.DDDUnisabana.inscripcionAsignaturas.domain.entity;

import com.example.DDDUnisabana.inscripcionAsignaturas.domain.enums.Carrera;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {

    private int idEstudiante;
    private String nombre;
    private Carrera carrera;
    private int semestre;
    private List<Asignatura> asignaturas;


    public void incribirAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }


}
