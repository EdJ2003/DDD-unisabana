package com.example.DDDUnisabana.inscripcionClases.application.usecase;

import com.example.DDDUnisabana.inscripcionClases.application.exceptions.RegistrarClaseException;
import com.example.DDDUnisabana.inscripcionClases.application.port.in.IRegistrarClase;
import com.example.DDDUnisabana.inscripcionClases.domain.entity.Clase;
import com.example.DDDUnisabana.inscripcionClases.domain.repository.ClaseRepository;
import org.springframework.stereotype.Service;

@Service

public class RegistrarClasesUseCase implements IRegistrarClase {

    private final ClaseRepository claseRepository;

    public RegistrarClasesUseCase(ClaseRepository claseRepository) {
        this.claseRepository = claseRepository;
    }

    @Override
    public void registrarClase(ClaseDTO claseDTO) {
        try
        {
            Clase clase = new Clase(claseDTO.codigoClase(), claseDTO.nombre(), claseDTO.creditos(), claseDTO.profesor(), claseDTO.estadoClase());
            claseRepository.registrarClase(clase);
        } catch (Exception e){
            throw new RegistrarClaseException(claseDTO.codigoClase(),claseDTO.nombre(),claseDTO.creditos(),claseDTO.profesor());
        }

    }
}
