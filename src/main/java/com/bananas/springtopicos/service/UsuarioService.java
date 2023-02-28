package com.bananas.springtopicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bananas.springtopicos.entity.Usuario;
import com.bananas.springtopicos.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario novoUsuario(Usuario usuario) {
        if(usuario == null
            || usuario.getNome() == null
            || usuario.getSenha() == null
        ) {
            throw new IllegalArgumentException("deu ruim");
        }

        return usuarioRepository.save(usuario);
    }
    
    public List<Usuario> buscarTodosUsuarios() {
        return usuarioRepository.findAll();
    }
}
