package com.example.DDDUnisabana.inscripcionClases.application.usecase;

import com.example.DDDUnisabana.inscripcionClases.domain.entity.Profesor;
import com.example.DDDUnisabana.inscripcionClases.domain.enums.EstadoClase;

public record ClaseDTO(int codigoClase, String nombre, int creditos, Profesor profesor, EstadoClase estadoClase) {
}
