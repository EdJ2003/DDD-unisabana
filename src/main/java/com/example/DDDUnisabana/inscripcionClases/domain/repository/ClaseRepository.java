package com.example.DDDUnisabana.inscripcionClases.domain.repository;

import com.example.DDDUnisabana.inscripcionClases.domain.entity.Clase;
import com.example.DDDUnisabana.matricula.domain.entity.Estudiante;

public interface ClaseRepository {

    Clase obtenerClase(int codigoClase);

    void actualizarEstadoClase(Clase clase);

}
