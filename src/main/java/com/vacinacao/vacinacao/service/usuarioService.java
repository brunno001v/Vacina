package com.vacinacao.vacinacao.service;

import java.util.List;

import com.vacinacao.vacinacao.model.CadUsuario;
import com.vacinacao.vacinacao.model.CadVacina;

public interface usuarioService {
	List<CadUsuario> findAll();
	CadUsuario findById(long id);
	CadUsuario save(CadUsuario cad);
	
	List<CadVacina> findAll1();
	CadVacina findById1(long id1);
	CadVacina save1(CadVacina cad1);
}
