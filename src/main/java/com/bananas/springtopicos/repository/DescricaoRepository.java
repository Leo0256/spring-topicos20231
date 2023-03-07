package com.bananas.springtopicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bananas.springtopicos.entity.Descricao;

public interface DescricaoRepository extends JpaRepository<Descricao, Long> {

}