package com.vacinacao.vacinacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vacinacao.vacinacao.model.CadUsuario;
import com.vacinacao.vacinacao.model.CadVacina;
import com.vacinacao.vacinacao.service.usuarioService;

@Controller
public class VacinaController {
	
	@Autowired
	usuarioService usuarioservice;
	
	@RequestMapping(value = "/cadusuario", method = RequestMethod.GET)
	public ModelAndView getUsuarios() {
		ModelAndView mv1 = new ModelAndView("cadusuario");
		List<CadUsuario> cadUsuario = usuarioservice.findAll();
		mv1.addObject("cadusuario", cadUsuario);
		return mv1;
	}
	
	@RequestMapping(value = "/cadvacina", method = RequestMethod.GET)
	public ModelAndView getVacinacao() {
		ModelAndView mv2 = new ModelAndView("cadvacina");
		List<CadVacina> cadVacinacao = usuarioservice.findAll1();
		mv2.addObject("cadvacina", cadVacinacao);
		return mv2;
	}
	
}