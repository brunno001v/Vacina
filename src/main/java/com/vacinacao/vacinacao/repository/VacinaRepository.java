package com.vacinacao.vacinacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vacinacao.vacinacao.model.CadVacina;

public interface VacinaRepository  extends JpaRepository<CadVacina,Long >{

}
