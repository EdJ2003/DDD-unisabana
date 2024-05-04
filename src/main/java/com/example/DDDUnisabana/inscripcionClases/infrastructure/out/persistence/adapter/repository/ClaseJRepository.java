package com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.adapter.repository;

import com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.orm.ClaseORM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaseJRepository extends JpaRepository<ClaseORM, Integer> {
}
