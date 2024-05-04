package com.example.DDDUnisabana.biblioteca.infrastructure.out.persistence.orm;

import com.example.DDDUnisabana.biblioteca.domain.enums.EstadoPrestamo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "prestamo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrestamoORM {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrestamo;
    @OneToOne
    @JoinColumn(name = "idEstudiante")
    private EstudianteORM estudiante;
    @OneToOne
    @JoinColumn(name = "idMaterial")
    private MaterialORM material;
    @Column
    private Date fechaVencimiento;
    @Column
    private EstadoPrestamo estadoPrestamo;
}
