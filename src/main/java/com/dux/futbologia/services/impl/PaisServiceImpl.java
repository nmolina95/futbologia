package com.dux.futbologia.services.impl;

import com.dux.futbologia.dto.PaisDTO;
import com.dux.futbologia.entity.Pais;
import com.dux.futbologia.exception.ResourceNotFound;
import com.dux.futbologia.repositories.PaisRepository;
import com.dux.futbologia.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaisServiceImpl implements PaisService {
    @Autowired
    PaisRepository paisRepository;

    @Override
    public Pais crearPais(PaisDTO paisDTO) {
        Pais pais = new Pais();
        pais.setNombre(paisDTO.getNombre());

        return paisRepository.save(pais);
    }

    @Override
    public List<Pais> obtenerPaises() {
        return paisRepository.findAll();
    }

    @Override
    public Pais findById(Integer id) {
        return paisRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pais no encontrado")
        );
    }
}
