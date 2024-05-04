package com.example.DDDUnisabana.infrastructure.out.persistence.orm;
import com.example.DDDUnisabana.domain.entity.Asignatura;
import com.example.DDDUnisabana.domain.entity.Estudiante;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import jakarta.persistence.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "estudiantes")
public class EstudianteORM {

    @Id
    @Column
    private int idEstudiante;

    @Column
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "carrera_id")
    private CarreraORM carrera;

    @Column
    private int semestre;

    @ManyToMany
    @JoinTable(
            name = "estudiante_asignatura",
            joinColumns = @JoinColumn(name = "idEstudiante"),
            inverseJoinColumns = @JoinColumn(name = "idAsignatura")
    )
    private List<AsignaturaORM> asignaturas;


    public Estudiante converToModel() {
        return new Estudiante(this.idEstudiante,this.nombre, this.carrera, this.semestre, this.asignaturas);
    }


}
