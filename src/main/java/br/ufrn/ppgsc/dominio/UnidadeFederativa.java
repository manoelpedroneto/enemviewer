package br.ufrn.ppgsc.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unidade_federativa", schema="public")
public class UnidadeFederativa implements IPersistente<Long> {

	@Id
	@Column(name = "id_unidade_federativa", nullable=false, unique=true)
	private Long id;
	
	@Column(name="sigla")
	private String sigla;

	@Column(name="nome")
	private String nome;
	
	@Column(name="regiao")
	private String regiao;


	public UnidadeFederativa() {
	}

	public UnidadeFederativa(Long id) {
		this.id = id;
	}
	
	public UnidadeFederativa(String sigla) {
		this.sigla = sigla;
	}
	
	@Override
	public String toString() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	@Override
	public boolean isNew() {
		return id == null;
	}

}
