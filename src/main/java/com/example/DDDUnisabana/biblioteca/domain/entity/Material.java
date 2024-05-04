package com.example.DDDUnisabana.biblioteca.domain.entity;

import com.example.DDDUnisabana.biblioteca.domain.enums.TipoMaterial;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Material {
    private int idMaterial;
    private String titulo;
    private String autor;
    private int fechaPublicacion;
    private TipoMaterial tipoMaterial;
}
