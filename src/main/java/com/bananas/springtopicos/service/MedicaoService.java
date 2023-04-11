package com.bananas.springtopicos.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bananas.springtopicos.entity.Medicao;
import com.bananas.springtopicos.repository.MedicaoRep;

@Service
public class MedicaoService {
    
    @Autowired
    private MedicaoRep repository;

    public Medicao novoMedicao(Medicao medicao) {
        medicao.setDataHora(LocalDateTime.now());
        return repository.save(medicao);
    }

    public List<Medicao> buscarTodosMedicao() {
        return repository.findAll();
    }

    public Medicao buscarMedicao(Long id) {
        Optional<Medicao> medicaoOp = repository.findById(id);
        return medicaoOp.get();
    }

}
