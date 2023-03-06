package com.bananas.springtopicos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNaoEncontrado extends IllegalArgumentException {
    public UsuarioNaoEncontrado() {
        super();
    }

    public UsuarioNaoEncontrado(String erro) {
        super(erro);
    }
}
