package com.example.DDDUnisabana.domain.repository;

import com.example.DDDUnisabana.domain.entity.Estudiante;

public interface EstudianteRepository {

    Estudiante obtenerEstudiante(int idEstudiante);

    void actualizarEstudiante(Estudiante estudiante);
}
