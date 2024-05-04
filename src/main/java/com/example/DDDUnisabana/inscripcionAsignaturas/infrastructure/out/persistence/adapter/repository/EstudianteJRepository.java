package com.example.DDDUnisabana.inscripcionAsignaturas.infrastructure.out.persistence.adapter.repository;

import com.example.DDDUnisabana.inscripcionAsignaturas.infrastructure.out.persistence.orm.EstudianteORM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteJRepository extends JpaRepository<EstudianteORM, Integer> {
}
