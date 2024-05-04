package com.example.DDDUnisabana.inscripcionClases.infrastructure.out.persistence.adapter;


import com.example.DDDUnisabana.inscripcionClases.domain.entity.Clase;
import com.example.DDDUnisabana.inscripcionClases.domain.repository.ClaseRepository;
import org.springframework.stereotype.Service;

@Service
public class ClaseAdapterRepository implements ClaseRepository {


    @Override
    public Clase obtenerClase(int codigoClase) {
        return null;
    }

    @Override
    public void actualizarEstadoClase(Clase clase) {

    }
}
