package com.example.DDDUnisabana.inscripcionClases.infrastructure.in.dto;

import com.example.DDDUnisabana.inscripcionClases.domain.entity.Profesor;
import com.example.DDDUnisabana.inscripcionClases.domain.enums.EstadoClase;

public record ClaseCDTO(int codigoClase, String nombre, int creditos, Profesor profesor, EstadoClase estadoClase) {
}
