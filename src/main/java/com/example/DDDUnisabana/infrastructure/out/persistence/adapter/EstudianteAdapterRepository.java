package com.example.DDDUnisabana.infrastructure.out.persistence.adapter;


import com.example.DDDUnisabana.domain.entity.Estudiante;
import com.example.DDDUnisabana.domain.repository.EstudianteRepository;
import com.example.DDDUnisabana.infrastructure.out.persistence.adapter.repository.EstudianteJRepository;
import com.example.DDDUnisabana.infrastructure.out.persistence.orm.EstudianteORM;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class EstudianteAdapterRepository implements EstudianteRepository {

    private final EstudianteJRepository estudianteJRepository;

    public EstudianteAdapterRepository(EstudianteJRepository estudianteJRepository) {
        this.estudianteJRepository = estudianteJRepository;
     }


    @Override
    public Estudiante obtenerEstudiante(int idEstudiante) {
        Optional<EstudianteORM> byId = estudianteJRepository.findById(idEstudiante);
        byId.ifPresent(EstudianteORM::converToModel);
        return null;
    }

    @Override
    public void actualizarEstudiante(Estudiante estudiante) {

    }
}
