package com.dux.futbologia.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EquipoResponseDTO {
    private Long id;
    private String nombre;
    private String liga;
    private String pais;
}
