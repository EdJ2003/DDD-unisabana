package com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.orm;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfesorORM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesor;

    @Column
    private int nombre;

    @OneToMany
    private List<ClaseORM> clases;


}
