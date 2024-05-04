package com.example.DDDUnisabana.inscripcionAsignaturas.infrastructure.out.persistence.orm;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "estudiante_asignatura")
public class AsignaturaORM
{
    @Id
    @Column
    private int idAsignatura;

    @Column
    private String nombre;

    @Column
    private int creditos;

    @ManyToMany
    @JoinTable(
            name = "estudiantes",
            joinColumns = @JoinColumn(name = "idAsignatura"),
            inverseJoinColumns = @JoinColumn(name = "idEstudiante")
    )
    private List<EstudianteORM> estudiantes;
}
