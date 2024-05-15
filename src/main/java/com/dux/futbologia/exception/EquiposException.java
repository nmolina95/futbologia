package com.dux.futbologia.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

public class EquiposException extends RuntimeException {

    @Getter
    @Setter
    private HttpStatus httpStatus;

    public EquiposException(HttpStatus httpStatus, String mensajeError) {
        super(mensajeError);
        this.httpStatus = httpStatus;
    }
}
