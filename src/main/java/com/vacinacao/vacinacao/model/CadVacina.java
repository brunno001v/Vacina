package com.vacinacao.vacinacao.model;

import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "TB_VACINA")
public class CadVacina {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id1;
	
	@NotBlank
	private String nomeVacina;
	
	@NotBlank
	@Email
	private String email;
	
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private LocalDate dataAplicacao;


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getDataAplicacao() {
		return dataAplicacao;
	}


	public void setDataAplicacao(LocalDate dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}


	public String getNomeVacina() {
		return nomeVacina;
	}


	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}


	public Long getId() {
		return id1;
	}
	
}
