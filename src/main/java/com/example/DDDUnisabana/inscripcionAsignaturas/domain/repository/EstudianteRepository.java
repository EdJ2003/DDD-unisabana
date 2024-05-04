package com.example.DDDUnisabana.inscripcionAsignaturas.domain.repository;

import com.example.DDDUnisabana.inscripcionAsignaturas.domain.entity.Estudiante;

public interface EstudianteRepository {

    Estudiante obtenerEstudiante(int idEstudiante);

    void actualizarEstudiante(Estudiante estudiante);
}
