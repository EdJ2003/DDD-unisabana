package com.example.DDDUnisabana.inscripcionClases.infrastructure.in.controller;


import com.example.DDDUnisabana.inscripcionClases.application.port.in.IRegistrarProfesor;
import com.example.DDDUnisabana.inscripcionClases.application.usecase.ProfesorDTO;
import com.example.DDDUnisabana.inscripcionClases.infrastructure.in.dto.ProfesorCDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/profes")
public class ProfesorController {

    private final IRegistrarProfesor registrarProfesor;

    @PostMapping("/registrar")
    public void crearClase(@RequestBody ProfesorCDTO profesorCDTO){
        ProfesorDTO profesorDTO = new ProfesorDTO(profesorCDTO.idProfesor(), profesorCDTO.nombre());
        registrarProfesor.registrarProfesor(profesorDTO);
    }
}
