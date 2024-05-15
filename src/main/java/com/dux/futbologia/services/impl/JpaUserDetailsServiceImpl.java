package com.dux.futbologia.services.impl;

import com.dux.futbologia.entity.Usuario;
import com.dux.futbologia.exception.ResourceNotFound;
import com.dux.futbologia.repositories.UsuarioRepository;
import com.dux.futbologia.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JpaUserDetailsServiceImpl  implements UserDetailsService {
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.buscarPorUsuario(username)
                .orElseThrow(() -> new ResourceNotFound("Usuario no encontrado"));

        List<GrantedAuthority> authorities = new ArrayList<>();

        return new User(usuario.getUsername(),
                usuario.getPassword(),
                true,
                true,
                true,
                true,
                authorities);
    }
}
