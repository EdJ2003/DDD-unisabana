package com.example.DDDUnisabana.infrastructure.out.persistence.orm;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "carreras")
public class CarreraORM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    // Si estás usando una relación bidireccional, puedes incluir la siguiente anotación y campo
    // Esto establece la relación inversa: una carrera tiene muchos estudiantes
    @OneToMany(mappedBy = "carrera")
    private List<EstudianteORM> estudiantes;


}