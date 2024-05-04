package com.example.DDDUnisabana.biblioteca.infrastructure.out.persistence.adapter.repository;

import com.example.DDDUnisabana.biblioteca.infrastructure.out.persistence.orm.MaterialORM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialJRepository extends JpaRepository<MaterialORM, Integer> {
}
