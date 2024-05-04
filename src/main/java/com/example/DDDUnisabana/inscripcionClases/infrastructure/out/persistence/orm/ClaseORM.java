package com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.orm;

import com.example.DDDUnisabana.inscripcionClases.domain.enums.EstadoClase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "asignatura")
public class ClaseORM
{
    @Id
    @Column
    private int codigoClase;

    @Column
    private String nombre;

    @Column
    private int creditos;

    @ManyToOne
    @JoinColumn(name = "idProfesor")
    private ProfesorORM profesor;

    @Column
    private EstadoClase estadoClase;

}
