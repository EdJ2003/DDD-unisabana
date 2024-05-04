package com.example.DDDUnisabana.inscripcionClases.application.exceptions;

import com.example.DDDUnisabana.inscripcionClases.domain.entity.Profesor;

public class RegistrarClaseException extends RuntimeException {
    public RegistrarClaseException(int codigo, String nombre, int creditos, Profesor profesor) {
        super("Ha ocurrido un error al registrar la clase "+ nombre + " de " + creditos + " créditos, con código " + codigo + " con el profesor " + profesor);
    }
}
