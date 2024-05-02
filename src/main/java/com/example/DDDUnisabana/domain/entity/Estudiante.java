package com.example.DDDUnisabana.domain.entity;

import lombok.Getter;

import java.util.List;

public class Estudiante {

    private int idEstudiante;

    private String nombre;

    @Getter
    private Carrera carrera;

    private int semestre;

    private List<Asignatura> asignaturas;






    public Estudiante(int idEstudiante,String nombre, Carrera carrera, int semestre, List<Asignatura> asignaturas) {
        this.idEstudiante = idEstudiante;
        this.nombre= nombre;
        this.carrera = carrera;
        this.semestre = semestre;
        this.asignaturas = asignaturas;
    }

    public void incribirAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }


}
