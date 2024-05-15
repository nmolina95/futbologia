package com.dux.futbologia.services.impl;

import com.dux.futbologia.dto.AuthRequestDTO;
import com.dux.futbologia.entity.Usuario;
import com.dux.futbologia.services.AuthService;
import com.dux.futbologia.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.io.UnsupportedEncodingException;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    UsuarioService usuarioService;

    @Override
    public ResponseEntity<?> attempt(AuthRequestDTO authRequestDTO) {
        String username = authRequestDTO.getUsername();
        Usuario usuario = usuarioService.buscarPorUsuario(username)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado"));

        return BCrypt.checkpw(authRequestDTO.getPassword(), usuario.getPassword()) ?
                new ResponseEntity<>(usuario, HttpStatus.ACCEPTED) :
                new ResponseEntity<>("Credenciales invalidas", HttpStatus.UNAUTHORIZED);
    }

    @Override
    public ResponseEntity<?> register(AuthRequestDTO authRequestDTO) throws UnsupportedEncodingException {
        Usuario usuario = usuarioService.buscarPorUsuario((authRequestDTO.getUsername()))
                .orElse(null);

        if(usuario != null) return new ResponseEntity<>("El usuario ya existe", HttpStatus.CONFLICT);

        return new ResponseEntity<>(usuarioService.save(authRequestDTO), HttpStatus.CREATED);
    }
}
