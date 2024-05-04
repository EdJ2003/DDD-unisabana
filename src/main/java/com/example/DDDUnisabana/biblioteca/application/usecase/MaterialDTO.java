package com.example.DDDUnisabana.biblioteca.application.usecase;

import com.example.DDDUnisabana.biblioteca.domain.enums.TipoMaterial;

public record MaterialDTO(
        String titulo,
        String autor,
        int fechaPublicacion,
        TipoMaterial tipoMaterial
) {
}
