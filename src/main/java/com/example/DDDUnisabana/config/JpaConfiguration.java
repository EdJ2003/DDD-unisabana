package com.example.DDDUnisabana.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.DDDUnisabana.matricula.infrastructure.out.persistence.adapter.repository")
@EntityScan("com.example.DDDUnisabana.matricula.infrastructure.out.persistence.orm")
public class JpaConfiguration {
    // Configuraciones adicionales si es necesario
}