package com.dux.futbologia.services;

import com.dux.futbologia.dto.AuthRequestDTO;
import com.dux.futbologia.entity.Usuario;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.io.UnsupportedEncodingException;
import java.util.Optional;

public interface UsuarioService {
    Optional<Usuario> buscarPorUsuario(String nombre);
    Usuario save(AuthRequestDTO authRequestDTO) throws UnsupportedEncodingException;
}
