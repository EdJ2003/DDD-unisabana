package com.example.DDDUnisabana.inscripcionClases.infrastructure.in.controller;

import com.example.DDDUnisabana.inscripcionClases.application.port.in.IRegistrarClase;
import com.example.DDDUnisabana.inscripcionClases.application.usecase.ClaseDTO;
import com.example.DDDUnisabana.inscripcionClases.infrastructure.in.dto.ClaseCDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/clases")
public class ClaseController {

    private final IRegistrarClase registrarClase;

    @PostMapping("/registrar")
    public void crearClase(@RequestBody ClaseCDTO claseCDTO){
        ClaseDTO claseDTO = new ClaseDTO(claseCDTO.codigoClase(),claseCDTO.nombre(),claseCDTO.creditos(),claseCDTO.profesor(),claseCDTO.estadoClase());
        registrarClase.registrarClase(claseDTO);
    }

}
