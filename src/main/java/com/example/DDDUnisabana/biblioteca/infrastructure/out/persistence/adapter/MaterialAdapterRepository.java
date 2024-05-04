package com.example.DDDUnisabana.biblioteca.infrastructure.out.persistence.adapter;

import com.example.DDDUnisabana.biblioteca.domain.entity.Material;
import com.example.DDDUnisabana.biblioteca.domain.repository.MaterialRepository;
import com.example.DDDUnisabana.biblioteca.infrastructure.out.persistence.adapter.repository.MaterialJRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MaterialAdapterRepository implements MaterialRepository {

    private final MaterialJRepository materialJRepository;

    @Override
    public Material obtenerMaterial(int idMaterial) {
        return null;
    }

    @Override
    public void agregarMaterial(Material material) {

    }
}
