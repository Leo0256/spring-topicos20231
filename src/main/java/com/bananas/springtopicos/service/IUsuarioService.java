package com.bananas.springtopicos.service;

import java.util.List;

import com.bananas.springtopicos.entity.Usuario;

public interface IUsuarioService {
    public Usuario novoUsuario(Usuario usuario);

    public List<Usuario> buscarTodosUsuarios();

    public Usuario buscarPorId(Long id);
}
