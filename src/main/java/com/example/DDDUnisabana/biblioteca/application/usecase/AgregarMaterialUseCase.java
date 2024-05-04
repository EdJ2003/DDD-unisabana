package com.example.DDDUnisabana.biblioteca.application.usecase;

import com.example.DDDUnisabana.biblioteca.application.exceptions.AgregarMaterialException;
import com.example.DDDUnisabana.biblioteca.application.port.in.IAgregarMaterial;
import com.example.DDDUnisabana.biblioteca.domain.entity.Material;
import com.example.DDDUnisabana.biblioteca.domain.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgregarMaterialUseCase implements IAgregarMaterial {
    @Autowired
    private MaterialRepository materialRepository;
    @Override
    public void agregarMaterial(MaterialDTO materialDTO) {
        try {
            Material material = new Material();
            material.setTitulo(materialDTO.titulo());
            material.setAutor(materialDTO.autor());
            material.setFechaPublicacion(materialDTO.fechaPublicacion());
            material.setTipoMaterial(materialDTO.tipoMaterial());
            materialRepository.agregarMaterial(material);
        } catch (Exception e){
            throw new AgregarMaterialException(materialDTO.titulo());
        }
    }
}
