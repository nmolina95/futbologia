package com.dux.futbologia.controllers;

import com.dux.futbologia.dto.LigaDTO;
import com.dux.futbologia.entity.Liga;
import com.dux.futbologia.services.LigaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/liga")
public class LigaController {
    @Autowired
    LigaService ligaService;

    @PostMapping
    public ResponseEntity<Liga> crearLiga(@RequestBody LigaDTO ligaDTO) {
        return new ResponseEntity<>(ligaService.crearLiga(ligaDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Liga>> obtenerLigas() {
        return new ResponseEntity<>(ligaService.getAll(), HttpStatus.OK);
    }
}
