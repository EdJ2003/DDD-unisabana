package com.example.DDDUnisabana.matricula.infrastructure.out.persistence.adapter;


import com.example.DDDUnisabana.matricula.domain.entity.EstudianteMatricula;
import com.example.DDDUnisabana.matricula.domain.repository.EstudianteMatriculaRepository;
import com.example.DDDUnisabana.matricula.infrastructure.out.persistence.adapter.repository.EstudianteMatriculaJRepository;
import com.example.DDDUnisabana.matricula.infrastructure.out.persistence.orm.EstudianteMatriculaORM;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class EstudianteMatriculaAdapterRepository implements EstudianteMatriculaRepository {

    private final EstudianteMatriculaJRepository estudianteJRepository;

    public EstudianteMatriculaAdapterRepository(EstudianteMatriculaJRepository estudianteJRepository) {
        this.estudianteJRepository = estudianteJRepository;
     }


    @Override
    public EstudianteMatricula obtenerEstudiante(int idEstudiante)
    {
        Optional<EstudianteMatriculaORM> estudianteOptional = estudianteJRepository.findById(idEstudiante);
        if (estudianteOptional.isPresent())
        {
            EstudianteMatriculaORM EstudianteORM = estudianteOptional.get();
            EstudianteMatricula estudiante = new EstudianteMatricula();
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
    public void actualizarEstudiante(EstudianteMatricula estudiante) {
    }
}
