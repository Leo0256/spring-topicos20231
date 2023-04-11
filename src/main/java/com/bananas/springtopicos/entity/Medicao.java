package com.bananas.springtopicos.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mdc_medicao")
public class Medicao {

    @Id
    @Column(name = "mdc_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mdc_data_hora")
    private LocalDateTime dataHora;

    @Column(name = "mdc_temperatura")
    private Float temperatura;

    @Column(name = "mdc_umidade")
    private Float umidade;

    @Column(name = "mdc_particulas")
    private Float particulas;

    @Column(name = "mdc_status")
    private String status;

    @Column(name = "mdc_data_processamento")
    private LocalDateTime dataProcessamento;

    public Medicao(Long id, LocalDateTime dataHora, Float temperatura, Float umidade, Float particulas, String status,
            LocalDateTime dataProcessamento) {
        this.id = id;
        this.dataHora = dataHora;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.particulas = particulas;
        this.status = status;
        this.dataProcessamento = dataProcessamento;
    }

    public Medicao() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Float temperatura) {
        this.temperatura = temperatura;
    }

    public Float getUmidade() {
        return umidade;
    }

    public void setUmidade(Float umidade) {
        this.umidade = umidade;
    }

    public Float getParticulas() {
        return particulas;
    }

    public void setParticulas(Float particulas) {
        this.particulas = particulas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataProcessamento() {
        return dataProcessamento;
    }

    public void setDataProcessamento(LocalDateTime dataProcessamento) {
        this.dataProcessamento = dataProcessamento;
    }

}