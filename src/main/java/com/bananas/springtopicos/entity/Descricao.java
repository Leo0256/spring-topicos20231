package com.bananas.springtopicos.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usr_descricao")
public class Descricao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usr_desc_id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, targetEntity = Usuario.class)
    @JoinColumn(name = "usr_id", referencedColumnName = "usr_id")
    private Long usr_id;

    @Column(name = "usr_endereco")
    private String endereco;

    @Column(name = "usr_frase")
    private String frase;

    public Descricao(Long usr_id ,String endereco ,String frase) {
        setUsr_id(usr_id);
        setEndereco(endereco);
        setFrase(frase);
    }

    public Descricao() {
        // Estou vazio '-'
    }

    public Long getId() {
        return id;
    }

    public Long getUsr_id() {
        return usr_id;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getFrase() {
        return frase;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsr_id(Long usr_id) {
        this.usr_id = usr_id;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

}
