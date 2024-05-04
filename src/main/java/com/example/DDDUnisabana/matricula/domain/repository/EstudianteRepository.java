package com.example.DDDUnisabana.matricula.domain.repository;

import com.example.DDDUnisabana.matricula.domain.entity.Estudiante;

public interface EstudianteRepository {

    Estudiante obtenerEstudiante(int idEstudiante);

    void actualizarEstudiante(Estudiante estudiante);
}
