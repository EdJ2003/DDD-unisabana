package com.example.DDDUnisabana.matricula.infrastructure.out.persistence.adapter.repository;

import com.example.DDDUnisabana.matricula.infrastructure.out.persistence.orm.EstudianteMatriculaORM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteMatriculaJRepository extends JpaRepository<EstudianteMatriculaORM, Integer> {
}
