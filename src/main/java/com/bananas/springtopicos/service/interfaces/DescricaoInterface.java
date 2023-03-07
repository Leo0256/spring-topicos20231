package com.bananas.springtopicos.service.interfaces;

import java.util.List;

import com.bananas.springtopicos.entity.Descricao;

public interface DescricaoInterface {
    public Descricao novaDescricao(Descricao descricao);

    public List<Descricao> buscarTodasDescricoes();

    public Descricao buscarPorId(Long id);
}
