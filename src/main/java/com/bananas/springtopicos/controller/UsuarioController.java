package com.bananas.springtopicos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bananas.springtopicos.entity.Usuario;
//import javax.persistence.RestController;
import com.bananas.springtopicos.service.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping(value = "/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;

    @PostMapping
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        return service.novoUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> buscarTodosUsuarios() {
        return service.buscarTodosUsuarios();
    }

    @GetMapping(value = "/id/{usuario}")
    public Usuario buscarPorId(@PathVariable("usuario") Long id) {
        return service.buscarPorId(id);
    }
}
