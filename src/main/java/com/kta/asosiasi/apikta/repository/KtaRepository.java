package com.kta.asosiasi.apikta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kta.asosiasi.apikta.entities.KtaEntity;


public interface KtaRepository extends JpaRepository<KtaEntity, Integer> {
	
}