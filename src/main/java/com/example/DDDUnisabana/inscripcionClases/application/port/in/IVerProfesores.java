package com.example.DDDUnisabana.inscripcionClases.application.port.in;

import com.example.DDDUnisabana.inscripcionClases.domain.entity.Profesor;
import com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.orm.ProfesorORM;

import java.util.List;

public interface IVerProfesores {

    List<ProfesorORM> verProfesores();
}
