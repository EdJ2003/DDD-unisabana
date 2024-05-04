package com.example.DDDUnisabana.inscripcionClases.infrastructure.in.controller;


import com.example.DDDUnisabana.inscripcionClases.application.port.in.IRegistrarProfesor;
import com.example.DDDUnisabana.inscripcionClases.application.port.in.IVerProfesores;
import com.example.DDDUnisabana.inscripcionClases.application.usecase.ProfesorDTO;
import com.example.DDDUnisabana.inscripcionClases.infrastructure.in.dto.ProfesorCDTO;
import com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.orm.ProfesorORM;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/profes")
public class ProfesorController {

    private final IRegistrarProfesor registrarProfesor;
    private final IVerProfesores verProfesores;

    @PostMapping("/registrar")
    public void crearClase(@RequestBody ProfesorCDTO profesorCDTO){
        ProfesorDTO profesorDTO = new ProfesorDTO(profesorCDTO.idProfesor(), profesorCDTO.nombre());
        registrarProfesor.registrarProfesor(profesorDTO);
    }

    @GetMapping("/todos")
    public List<ProfesorORM> verProfesores(){
        return verProfesores.verProfesores();
    }
}
