package com.example.DDDUnisabana.inscripcionClases.domain.entity;

import com.example.DDDUnisabana.inscripcionClases.domain.enums.EstadoClase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clase {

    private int codigoClase;
    private String nombre;
    private int creditos;
    private Profesor profesor;
    private EstadoClase estadoClase;

}
