package com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.adapter;


import com.example.DDDUnisabana.inscripcionClases.domain.entity.Clase;
import com.example.DDDUnisabana.inscripcionClases.domain.entity.Profesor;
import com.example.DDDUnisabana.inscripcionClases.domain.repository.ClaseRepository;
import com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.adapter.repository.ClaseJRepository;
import com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.orm.ClaseORM;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
@AllArgsConstructor
public class ClaseAdapterRepository implements ClaseRepository {

    private final ClaseJRepository claseJRepository;


    @Override
    public Clase obtenerClase(int codigoClase) {
        Optional<ClaseORM> claseOptional = claseJRepository.findById(codigoClase);
        if (claseOptional.isPresent())
        {
            ClaseORM ClaseORM = claseOptional.get();
            Clase clase = new Clase();
            clase.setCodigoClase(ClaseORM.getCodigoClase());
            clase.setNombre(ClaseORM.getNombre());
            clase.setCreditos(ClaseORM.getCreditos());
            Profesor profesor = convertProfesor(clase.getProfesor());
            clase.setProfesor(profesor);
            clase.setEstadoClase(ClaseORM.getEstadoClase());
            return clase;
        }else{
            return null;
        }
    }

    @Override
    public void registrarClase(Clase clase)
    {

            ClaseORM ClaseORM = new ClaseORM();
            clase.setCodigoClase(ClaseORM.getCodigoClase());
            clase.setNombre(ClaseORM.getNombre());
            clase.setCreditos(ClaseORM.getCreditos());
            Profesor profesor = convertProfesor(clase.getProfesor());
            clase.setProfesor(profesor);
            clase.setEstadoClase(ClaseORM.getEstadoClase());
            claseJRepository.save(ClaseORM);

            System.out.println(clase);

    }


    private Profesor convertProfesor(Profesor profesor)
    {
        return new Profesor(profesor.getIdProfesor(), profesor.getNombre());
    }
}
