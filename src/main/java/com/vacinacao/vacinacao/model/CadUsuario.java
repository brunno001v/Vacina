package com.vacinacao.vacinacao.model;

import java.time.LocalDate;

import javax.persistence.*;


import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name= "TB_USER")

public class CadUsuario {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@NotBlank
	private String nomeUsuario;
	
	@NotBlank
	@Email
	private String email;
	
	@NotBlank
	private String cpf;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private LocalDate dataNasc;
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Long getId() {
		return id;
	}
}
