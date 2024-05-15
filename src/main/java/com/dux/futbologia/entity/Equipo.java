package com.dux.futbologia.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EQUIPOS")
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private Long id;
    private String nombre;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "LIGA_ID")
    private Liga liga;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PAIS_ID")
    private Pais pais;
}
