package com.dux.futbologia.services;

import com.dux.futbologia.dto.LigaDTO;
import com.dux.futbologia.entity.Liga;
import java.util.List;

public interface LigaService {
    Liga crearLiga(LigaDTO ligaDTO);
    List<Liga> getAll();
    Liga findById(Integer id);
}
