package com.dux.futbologia.controllers;

import com.dux.futbologia.dto.EquipoDTO;
import com.dux.futbologia.dto.EquipoResponseDTO;
import com.dux.futbologia.entity.Equipo;
import com.dux.futbologia.services.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipos")
public class EquipoController {
    @Autowired
    EquipoService equipoService;

    @PostMapping
    public ResponseEntity<EquipoResponseDTO> crearEquipo(@RequestBody EquipoDTO equipoDTO) {
        return new ResponseEntity<>(equipoService.crearEquipo(equipoDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EquipoResponseDTO> obtenerEquipo(@PathVariable("id") Long id) {
        return new ResponseEntity<>(equipoService.buscarPorId(id), HttpStatus.OK);
    }

    @GetMapping("/buscar")
    public ResponseEntity<EquipoResponseDTO> obtenerEquipo(@RequestParam String nombre) {
        return new ResponseEntity<>(equipoService.buscarPorNombre(nombre), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<EquipoResponseDTO>> obtenerEquipos() {
        return new ResponseEntity<>(equipoService.buscarTodos(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EquipoResponseDTO> actualizarEquipo(@PathVariable("id") Long id,
                                                              @RequestBody EquipoDTO equipoDTO) {
        return new ResponseEntity<>(equipoService.actualizar(id, equipoDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarEquipo(@PathVariable("id") Long id) {
        this.equipoService.borrarEquipo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
