package com.dux.futbologia.services;

import com.dux.futbologia.dto.AuthRequestDTO;
import org.springframework.http.ResponseEntity;
import java.io.UnsupportedEncodingException;

public interface AuthService {
    ResponseEntity<?> attempt(AuthRequestDTO authRequestDTO);
    ResponseEntity<?> register(AuthRequestDTO authRequestDTO) throws UnsupportedEncodingException;
}
