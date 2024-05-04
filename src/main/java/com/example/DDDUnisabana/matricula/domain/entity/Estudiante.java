package com.example.DDDUnisabana.matricula.domain.entity;

import com.example.DDDUnisabana.matricula.domain.enums.Carrera;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {

    private int idEstudiante;
    private String nombre;
    private Carrera carrera;
    private int semestre;



    public void incribirAsignaturas() {

    }


}
