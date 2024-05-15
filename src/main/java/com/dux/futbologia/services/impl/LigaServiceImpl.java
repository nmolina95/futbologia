package com.dux.futbologia.services.impl;

import com.dux.futbologia.dto.LigaDTO;
import com.dux.futbologia.entity.Liga;
import com.dux.futbologia.repositories.LigaRepository;
import com.dux.futbologia.services.LigaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class LigaServiceImpl implements LigaService {
    @Autowired
    LigaRepository ligaRepository;

    @Override
    public Liga crearLiga(LigaDTO ligaDTO) {
        Liga liga = new Liga();
        liga.setNombre(ligaDTO.getNombre());

        return ligaRepository.save(liga);
    }

    @Override
    public List<Liga> getAll() {
        return ligaRepository.findAll();
    }

    @Override
    public Liga findById(Integer id) {
        return ligaRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Liga no encontrada")
        );
    }
}
