package com.bananas.springtopicos.service.interfaces;

import java.util.List;

import com.bananas.springtopicos.entity.Usuario;

public interface UsuarioInterface {
    public Usuario novoUsuario(Usuario usuario);

    public List<Usuario> buscarTodosUsuarios();

    public Usuario buscarPorId(Long id);
}
