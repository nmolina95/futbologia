package com.dux.futbologia.services;

import com.dux.futbologia.dto.PaisDTO;
import com.dux.futbologia.entity.Pais;
import java.util.List;

public interface PaisService {
    Pais crearPais(PaisDTO paisDTO);
    List<Pais> obtenerPaises();
    Pais findById(Integer id);
}
