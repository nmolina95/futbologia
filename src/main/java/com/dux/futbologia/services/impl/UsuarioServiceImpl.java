package com.dux.futbologia.services.impl;

import com.dux.futbologia.dto.AuthRequestDTO;
import com.dux.futbologia.entity.Usuario;
import com.dux.futbologia.exception.ResourceNotFound;
import com.dux.futbologia.repositories.UsuarioRepository;
import com.dux.futbologia.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public Optional<Usuario> buscarPorUsuario(String nombre) {
        return usuarioRepository.findByUsername(nombre);
    }

    @Override
    @Transactional
    public Usuario save(AuthRequestDTO authRequestDTO) throws UnsupportedEncodingException {
        Usuario usuario = this.usuarioRepository.save(
                Usuario.builder()
                        .username(authRequestDTO.getUsername())
                        .password(passwordEncoder().encode(authRequestDTO.getPassword()))
                        .build()
        );

        return this.usuarioRepository.save(usuario);
    }
}
