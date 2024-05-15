package com.dux.futbologia.services;

import com.dux.futbologia.dto.EquipoDTO;
import com.dux.futbologia.dto.EquipoResponseDTO;
import java.util.List;

public interface EquipoService {
    EquipoResponseDTO buscarPorId(Long id);
    EquipoResponseDTO buscarPorNombre(String nombre);
    EquipoResponseDTO crearEquipo(EquipoDTO equipoDTO);
    List<EquipoResponseDTO> buscarTodos();
    EquipoResponseDTO actualizar(Long id, EquipoDTO equipoDTO);
    void borrarEquipo(Long id);
}
