package com.dux.futbologia.dto.mapper;

import com.dux.futbologia.dto.EquipoResponseDTO;
import com.dux.futbologia.entity.Equipo;

public class EquipoResponseDTOMapper {
    private Equipo equipo;
    private EquipoResponseDTOMapper(){}

    public static EquipoResponseDTOMapper builder() {
        return new EquipoResponseDTOMapper();
    }

    public EquipoResponseDTOMapper setEquipo(Equipo equipo) {
        this.equipo = equipo;
        return this;
    }

    public EquipoResponseDTO build() {
        if(equipo == null) throw new RuntimeException("Debe pasar la entidad equipo");

        return new EquipoResponseDTO(
                equipo.getId(), equipo.getNombre(), equipo.getLiga().getNombre(), equipo.getPais().getNombre()
        );
    }
}
