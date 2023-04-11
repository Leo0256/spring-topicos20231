package com.bananas.springtopicos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bananas.springtopicos.entity.Medicao;
import com.bananas.springtopicos.service.MedicaoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/medicao")
public class MedicaoController {

    @Autowired
    private MedicaoService service;

    @PostMapping
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Medicao novoMedicao(@RequestBody Medicao medicao) {
        return service.novoMedicao(medicao);
    }

    @GetMapping
    public List<Medicao> buscarTodosMedicao() {
        return service.buscarTodosMedicao();
    }

    @GetMapping(value = "/{id}")
    public Medicao buscarMedicao(@PathVariable("id") Long id) {
        return service.buscarMedicao(id);
    }
    
}
