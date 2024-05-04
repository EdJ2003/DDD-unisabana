package com.example.DDDUnisabana.matricula.infrastructure.out.persistence.orm;
import com.example.DDDUnisabana.matricula.domain.enums.Carrera;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import jakarta.persistence.*;


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

}
