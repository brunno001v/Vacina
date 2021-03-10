package com.vacinacao.vacinacao.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vacinacao.vacinacao.model.CadUsuario;
import com.vacinacao.vacinacao.model.CadVacina;
import com.vacinacao.vacinacao.repository.VacinaRepository;
import com.vacinacao.vacinacao.repository.VacinacaoRepository;
import com.vacinacao.vacinacao.service.usuarioService;

@Service
public class UsuarioImplm implements usuarioService {
	
	@Autowired
	VacinacaoRepository vacinacaoRepository;
	
	@Autowired
	VacinaRepository vacinaRepository;
	
	@Override
	public List<CadUsuario> findAll() {
		return vacinacaoRepository.findAll();
	}
	@Override
	public CadUsuario findById(long id) {
		return vacinacaoRepository.findById(id).get();
	}
	@Override
	public CadUsuario save(CadUsuario cad) {
		return vacinacaoRepository.save(cad);
	}
	
	
	@Override
	public List<CadVacina> findAll1() {
		return vacinaRepository.findAll();
	}
	
	@Override
	public CadVacina findById1(long id) {
		return vacinaRepository.findById(id).get();
	}
	@Override
	public CadVacina save1(CadVacina cad) {
		return vacinaRepository.save(cad);
	}
}

