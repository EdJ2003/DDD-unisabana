package com.example.DDDUnisabana.inscripcionAsignaturas.infrastructure.out.persistence.orm;
import com.example.DDDUnisabana.inscripcionAsignaturas.domain.entity.Estudiante;
import com.example.DDDUnisabana.inscripcionAsignaturas.domain.enums.Carrera;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import jakarta.persistence.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "estudiantes")
public class EstudianteORM {

    @Id
    @Column
    private int idEstudiante;

    @Column
    private String nombre;

    @Column
    private Carrera carrera;

    @Column
    private int semestre;

    @ManyToMany
    @JoinTable(
            name = "estudiante_asignatura",
            joinColumns = @JoinColumn(name = "idEstudiante"),
            inverseJoinColumns = @JoinColumn(name = "idAsignatura")
    )
    private List<AsignaturaORM> asignaturas;




}
