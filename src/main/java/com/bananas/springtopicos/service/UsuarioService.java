package com.bananas.springtopicos.service;

import java.*;
import java.util.List;

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
