package com.example.DDDUnisabana.biblioteca.domain.repository;

import com.example.DDDUnisabana.biblioteca.domain.entity.Material;

public interface MaterialRepository {
    Material obtenerMaterial(int idMaterial);
    void agregarMaterial(Material material);
}
