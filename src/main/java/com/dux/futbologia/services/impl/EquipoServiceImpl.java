package com.dux.futbologia.services.impl;

import com.dux.futbologia.dto.EquipoDTO;
import com.dux.futbologia.dto.EquipoResponseDTO;
import com.dux.futbologia.dto.mapper.EquipoResponseDTOMapper;
import com.dux.futbologia.entity.Equipo;
import com.dux.futbologia.entity.Liga;
import com.dux.futbologia.entity.Pais;
import com.dux.futbologia.exception.ResourceNotFound;
import com.dux.futbologia.repositories.EquipoRepository;
import com.dux.futbologia.services.EquipoService;
import com.dux.futbologia.services.LigaService;
import com.dux.futbologia.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EquipoServiceImpl implements EquipoService {
    @Autowired
    EquipoRepository equipoRepository;
    @Autowired
    LigaService ligaService;
    @Autowired
    PaisService paisService;

    @Override
    @ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Equipo no encontrado")
    public EquipoResponseDTO buscarPorNombre(String nombre) {
        Equipo equipo = equipoRepository.findByNombre(nombre)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Equipo no encontrado"));

        return EquipoResponseDTOMapper.builder().setEquipo(equipo).build();
    }

    @Override
    public EquipoResponseDTO buscarPorId(Long id) {
        Equipo equipo = equipoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Equipo no encontrado"));

        return EquipoResponseDTOMapper.builder().setEquipo(equipo).build();
    }

    @Override
    public EquipoResponseDTO crearEquipo(EquipoDTO equipoDTO) {
        Equipo equipo = this.equipoRepository.save(this.armarEquipo(equipoDTO));

        return EquipoResponseDTOMapper.builder()
                .setEquipo(equipo)
                .build();
    }

    @Override
    public List<EquipoResponseDTO> buscarTodos() {
        List<Equipo> equipos = this.equipoRepository.findAll();

        return equipos.stream().map(
                equipo -> EquipoResponseDTOMapper.builder().setEquipo(equipo).build())
                .collect(Collectors.toList());
    }

    @Override
    public void borrarEquipo(Long id){
        Equipo equipo = equipoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Equipo no encontrado"));
        equipoRepository.delete(equipo);
    }

    @Override
    public EquipoResponseDTO actualizar(Long id, EquipoDTO equipoDTO) {
        Equipo equipo = equipoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Equipo no encontrado"));

        if(equipoDTO.getNombre() != null && !equipoDTO.getNombre().isEmpty()) {
            equipo.setNombre(equipoDTO.getNombre());
        }

        if(equipoDTO.getLiga() != null) {
            Liga liga = ligaService.findById(equipoDTO.getLiga());
            equipo.setLiga(liga);
        }
        if(equipoDTO.getPais() != null) {
            Pais pais = paisService.findById(equipoDTO.getPais());
            equipo.setPais(pais);
        }

        this.equipoRepository.save(equipo);

        return EquipoResponseDTOMapper.builder().setEquipo(equipo).build();
    }

    private Equipo armarEquipo(EquipoDTO equipoDTO) {
        if(equipoDTO.getNombre() == null || equipoDTO.getLiga() == null || equipoDTO.getPais() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Solicitud invalida");
        }

        return Equipo.builder()
                .nombre(equipoDTO.getNombre())
                .liga(ligaService.findById(equipoDTO.getLiga()))
                .pais(paisService.findById(equipoDTO.getPais()))
                .build();
    }
}
