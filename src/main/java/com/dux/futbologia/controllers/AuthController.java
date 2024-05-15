package com.dux.futbologia.controllers;

import com.dux.futbologia.dto.AuthRequestDTO;
import com.dux.futbologia.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> attempt(@RequestBody AuthRequestDTO authRequestDTO) {
        return authService.attempt(authRequestDTO);
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody AuthRequestDTO authRequestDTO) throws UnsupportedEncodingException {
        return authService.register(authRequestDTO);
    }
}
