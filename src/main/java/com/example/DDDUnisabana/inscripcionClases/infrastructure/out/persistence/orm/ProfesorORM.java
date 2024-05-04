package com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.orm;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfesorORM {

    @Id
    private int idProfesor;

    @Column
    private String nombre;



}
