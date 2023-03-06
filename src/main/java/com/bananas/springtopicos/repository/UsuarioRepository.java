package com.bananas.springtopicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bananas.springtopicos.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
