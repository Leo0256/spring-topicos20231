package com.bananas.springtopicos.repository;

import org.*;
import com.bananas.springtopicos.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
