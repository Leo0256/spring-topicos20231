package com.bananas.springtopicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bananas.springtopicos.entity.Medicao;

public interface MedicaoRep extends JpaRepository<Medicao, Long> {
    
}
