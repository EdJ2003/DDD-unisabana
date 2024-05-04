package com.example.DDDUnisabana.biblioteca.application.exceptions;

public class AgregarMaterialException extends RuntimeException {
    public AgregarMaterialException(String titulo) {
        super("No se pudo agregar el material con titulo: " + titulo);
    }
}
