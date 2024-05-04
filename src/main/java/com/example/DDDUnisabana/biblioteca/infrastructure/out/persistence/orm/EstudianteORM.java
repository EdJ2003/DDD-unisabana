package com.example.DDDUnisabana.biblioteca.infrastructure.out.persistence.orm;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "estudiante")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteORM {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;
    @Column
    private String nombre;
    @Column
    private int semestre;
}
