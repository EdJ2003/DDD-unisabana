package com.example.DDDUnisabana.inscripcionClases.application.usecase;


import com.example.DDDUnisabana.inscripcionClases.application.exceptions.RegistrarClaseException;
import com.example.DDDUnisabana.inscripcionClases.application.exceptions.RegistrarProfesoresException;
import com.example.DDDUnisabana.inscripcionClases.application.port.in.IRegistrarProfesor;
import com.example.DDDUnisabana.inscripcionClases.domain.entity.Profesor;
import com.example.DDDUnisabana.inscripcionClases.domain.repository.ProfesorRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistrarProfesoresUseCase implements IRegistrarProfesor {

    private final ProfesorRepository profesorRepository;

    public RegistrarProfesoresUseCase(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }


    @Override
    public void registrarProfesor(ProfesorDTO profesorDTO)
    {
        try {
            Profesor profesor = new Profesor(profesorDTO.idProfesor(), profesorDTO.nombre());
            profesorRepository.registrarProfesor(profesor);
        } catch (Exception e){
            throw new RegistrarProfesoresException(profesorDTO.idProfesor(),profesorDTO.nombre());
        }
    }
}
