package com.dux.futbologia.controllers;

import com.dux.futbologia.dto.PaisDTO;
import com.dux.futbologia.entity.Pais;
import com.dux.futbologia.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pais")
public class PaisController {
    @Autowired
    PaisService paisService;

    @PostMapping
    public ResponseEntity<Pais> crearPais(@RequestBody PaisDTO paisDTO) {
        return new ResponseEntity<>(paisService.crearPais(paisDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Pais>> obtenerPaises() {
        return new ResponseEntity<>(paisService.obtenerPaises(), HttpStatus.OK);
    }
}
