package com.example.DDDUnisabana.biblioteca.domain.entity;

import com.example.DDDUnisabana.biblioteca.domain.enums.EstadoPrestamo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prestamo {
    private int idPrestamo;
    private Estudiante estudiante;
    private Material material;
    private Date fechaVencimiento;
    private EstadoPrestamo estadoPrestamo;
}
