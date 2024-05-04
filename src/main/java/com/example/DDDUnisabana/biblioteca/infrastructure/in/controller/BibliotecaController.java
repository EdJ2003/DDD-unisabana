package com.example.DDDUnisabana.biblioteca.infrastructure.in.controller;

import com.example.DDDUnisabana.biblioteca.application.port.in.IAgregarMaterial;
import com.example.DDDUnisabana.biblioteca.application.usecase.MaterialDTO;
import com.example.DDDUnisabana.biblioteca.domain.entity.Material;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/biblioteca")
public class BibliotecaController {

    private final IAgregarMaterial agregarMaterial;

    @PostMapping("/nuevoPrestamo")
    public void nuevoPrestamo(@RequestBody Object object) {
    }

    @PostMapping("/agregarMaterial")
    public void agregarMaterial(@RequestBody MaterialDTO materialDTO) {
        agregarMaterial.agregarMaterial(materialDTO);
    }

    @GetMapping("/material/todo")
    public List<Material> obtenerMaterial() {
        return null;
    }
}
