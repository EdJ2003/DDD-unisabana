package com.example.DDDUnisabana.infrastructure.out.persistence.orm;
import com.example.DDDUnisabana.domain.entity.Asignatura;
import com.example.DDDUnisabana.domain.entity.Carrera;
import com.example.DDDUnisabana.domain.entity.Estudiante;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
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

    @Column
    private List<Asignatura> asignaturas;

    public Estudiante converToModel() {
        return new Estudiante(this.idEstudiante,this.nombre, this.carrera, this.semestre, this.asignaturas);
    }


}
