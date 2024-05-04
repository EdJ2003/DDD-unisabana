package com.example.DDDUnisabana.matricula.domain.repository;

import com.example.DDDUnisabana.matricula.domain.entity.EstudianteMatricula;

public interface EstudianteMatriculaRepository {

    EstudianteMatricula obtenerEstudiante(int idEstudiante);

    void actualizarEstudiante(EstudianteMatricula estudiante);
}
