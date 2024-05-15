package com.dux.futbologia;

import com.dux.futbologia.dto.EquipoResponseDTO;
import com.dux.futbologia.entity.Equipo;
import com.dux.futbologia.entity.Liga;
import com.dux.futbologia.entity.Pais;
import com.dux.futbologia.repositories.EquipoRepository;
import com.dux.futbologia.services.impl.EquipoServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.DataAccessResourceFailureException;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class EquipoServiceTest {
    @InjectMocks
    private EquipoServiceImpl equipoService;
    @Mock
    private EquipoRepository equipoRepository;

    @Test
    public void buscarTodos() {
        final Liga liga = new Liga(1, "La Liga");
        final Pais pais = new Pais(1, "España");
        final Equipo equipo = new Equipo(1L, "Real Madrid", liga, pais);

        List<Equipo> equipos = new ArrayList<>();
        equipos.add(equipo);
        Mockito.when(equipoRepository.findAll()).thenReturn(equipos);

        final List<EquipoResponseDTO> resultado = equipoService.buscarTodos();
        Assertions.assertFalse(resultado.isEmpty());
    }

    @Test
    public void buscarTodosVacio() {
        Mockito.when(equipoRepository.findAll()).thenReturn(new ArrayList<>());

        List<EquipoResponseDTO> equipos = equipoService.buscarTodos();
        Assertions.assertEquals(0, equipos.size());
    }

    @Test()
    public void buscarTodosExcepcion() {
        Mockito.when(equipoRepository.findAll()).thenThrow(DataAccessResourceFailureException.class);
        Assertions.assertThrows(DataAccessResourceFailureException.class, () -> equipoService.buscarTodos());
    }
}
