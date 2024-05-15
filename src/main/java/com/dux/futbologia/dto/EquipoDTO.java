package com.dux.futbologia.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipoDTO {
    private String nombre;
    private Integer liga;
    private Integer pais;
}
