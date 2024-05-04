package com.example.DDDUnisabana.inscripcionClases.domain.repository;

import com.example.DDDUnisabana.inscripcionClases.domain.entity.Profesor;
import com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.orm.ProfesorORM;

import java.util.List;

public interface ProfesorRepository {

    List<ProfesorORM> obtenerProfesores();

    void registrarProfesor(Profesor profesor);
}
