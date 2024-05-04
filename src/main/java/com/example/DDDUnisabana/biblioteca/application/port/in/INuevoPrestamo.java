package com.example.DDDUnisabana.biblioteca.application.port.in;

import com.example.DDDUnisabana.biblioteca.application.usecase.PrestamoDTO;

public interface INuevoPrestamo {
    void nuevoPrestamo(PrestamoDTO prestamoDTO);
}
