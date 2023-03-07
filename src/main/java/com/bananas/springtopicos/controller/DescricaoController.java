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

import com.bananas.springtopicos.entity.Descricao;
import com.bananas.springtopicos.service.DescricaoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/descr")
public class DescricaoController {
    
    @Autowired
    private DescricaoService service;

    @PostMapping
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Descricao novDescricao(@RequestBody Descricao descricao) {
        return service.novaDescricao(descricao);
    }

    @GetMapping
    public List<Descricao> buscarTodasDescricoes() {
        return service.buscarTodasDescricoes();
    }

    @GetMapping(value = "/id/{descr}")
    public Descricao buscarPorId(@PathVariable("descr") Long id) {
        return service.buscarPorId(id);
    }
}
