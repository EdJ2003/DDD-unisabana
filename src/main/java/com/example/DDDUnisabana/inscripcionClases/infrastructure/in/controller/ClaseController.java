package com.example.DDDUnisabana.inscripcionClases.infrastructure.in.controller;

import com.example.DDDUnisabana.inscripcionClases.infrastructure.in.dto.ClaseCDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clases")
public class ClaseController {


    @PostMapping
    public void crearClase(@RequestBody ClaseCDTO claseCDTO){

    }

}
