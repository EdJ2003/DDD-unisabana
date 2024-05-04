package com.example.DDDUnisabana.inscripcionClases.application.usecase;

import com.example.DDDUnisabana.inscripcionClases.application.port.in.IVerProfesores;
import com.example.DDDUnisabana.inscripcionClases.domain.repository.ProfesorRepository;
import com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.orm.ProfesorORM;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerProfesoresUseCase implements IVerProfesores {

    private final ProfesorRepository profesorRepository;

    public VerProfesoresUseCase(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    @Override
    public List<ProfesorORM> verProfesores() {
        return profesorRepository.obtenerProfesores();
    }
}
