package com.example.DDDUnisabana.biblioteca.infrastructure.out.persistence.orm;

import com.example.DDDUnisabana.biblioteca.domain.enums.TipoMaterial;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "material")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaterialORM {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMaterial;
    @Column
    private String titulo;
    @Column
    private String autor;
    @Column
    private int fechaPublicacion;
    @Column
    private TipoMaterial tipoMaterial;
}
