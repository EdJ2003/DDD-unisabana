package com.example.DDDUnisabana.inscripcionClases.domain.repository;

import com.example.DDDUnisabana.inscripcionClases.domain.entity.Clase;

public interface ClaseRepository {

    Clase obtenerClase(int codigoClase);

    void registrarClase(Clase clase);


}
