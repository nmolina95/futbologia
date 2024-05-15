package com.dux.futbologia.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LigaDTO {
    private Integer id;
    private String nombre;
    private Long liga;
    private Long pais;
}
