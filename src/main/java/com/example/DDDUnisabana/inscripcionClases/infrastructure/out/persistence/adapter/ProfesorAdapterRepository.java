package com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.adapter;


import com.example.DDDUnisabana.inscripcionClases.domain.entity.Profesor;
import com.example.DDDUnisabana.inscripcionClases.domain.repository.ProfesorRepository;
import com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.adapter.repository.ProfesorJRepository;
import com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.orm.ProfesorORM;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ProfesorAdapterRepository implements ProfesorRepository {

    private final ProfesorJRepository profesorJRepository;

    @Override
    public List<ProfesorORM> obtenerProfesores() {
        return profesorJRepository.findAll() ;
    }

    @Override
    public void registrarProfesor(Profesor profesor) {
        ProfesorORM profesorORM = new ProfesorORM();
        profesor.setIdProfesor(profesorORM.getIdProfesor());
        profesor.setNombre(profesorORM.getNombre());
        profesorJRepository.save(profesorORM);

    }
}
