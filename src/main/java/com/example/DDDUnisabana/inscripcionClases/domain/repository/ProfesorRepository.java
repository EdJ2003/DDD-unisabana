package com.example.DDDUnisabana.inscripcionClases.domain.repository;

import com.example.DDDUnisabana.inscripcionClases.domain.entity.Profesor;

public interface ProfesorRepository {

    Profesor obtenerProfesor(int idProfesor);

    void registrarProfesor(Profesor profesor);
}
