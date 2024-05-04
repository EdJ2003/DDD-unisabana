package com.example.DDDUnisabana.matricula.infrastructure.out.persistence.adapter;


import com.example.DDDUnisabana.matricula.domain.entity.Estudiante;
import com.example.DDDUnisabana.matricula.domain.repository.EstudianteRepository;
import com.example.DDDUnisabana.matricula.infrastructure.out.persistence.adapter.repository.EstudianteJRepository;
import com.example.DDDUnisabana.matricula.infrastructure.out.persistence.orm.EstudianteORM;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class EstudianteAdapterRepository implements EstudianteRepository {

    private final EstudianteJRepository estudianteJRepository;

    public EstudianteAdapterRepository(EstudianteJRepository estudianteJRepository) {
        this.estudianteJRepository = estudianteJRepository;
     }


    @Override
    public Estudiante obtenerEstudiante(int idEstudiante)
    {
        Optional<EstudianteORM> estudianteOptional = estudianteJRepository.findById(idEstudiante);
        if (estudianteOptional.isPresent())
        {
            EstudianteORM EstudianteORM = estudianteOptional.get();
            Estudiante estudiante = new Estudiante();
            estudiante.setIdEstudiante(EstudianteORM.getIdEstudiante());
            estudiante.setNombre(EstudianteORM.getNombre());
            estudiante.setCarrera(EstudianteORM.getCarrera());
            estudiante.setSemestre(EstudianteORM.getSemestre());
            return estudiante;
        }else{
            return null;
        }
    }

    @Override
    public void actualizarEstudiante(Estudiante estudiante) {
    }
}
