package com.bananas.springtopicos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bananas.springtopicos.entity.Descricao;
import com.bananas.springtopicos.repository.DescricaoRepository;
import com.bananas.springtopicos.service.interfaces.DescricaoInterface;

@Service
public class DescricaoService implements DescricaoInterface {

    @Autowired
    private DescricaoRepository descricaoRepository;

    public Descricao novaDescricao(Descricao descricao) {
        return descricaoRepository.save(descricao);
    }

    public List<Descricao> buscarTodasDescricoes() {
        return descricaoRepository.findAll();
    }

    public Descricao buscarPorId(Long id) {
        Optional<Descricao> descricaoOp = descricaoRepository.findById(id);

        if(descricaoOp.isEmpty()) {
            throw new IllegalArgumentException("Indescritivo.");
        }
        return descricaoOp.get();
    }
    
}
