package com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.adapter.repository;

import com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.orm.ProfesorORM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorJRepository extends JpaRepository<ProfesorORM, Integer> {
}
