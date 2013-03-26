package br.ufrn.ppgsc.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enem_rn", schema="public")
public class Inscricao implements IPersistente<Long> {

	@Id
	@Column(name = "nu_inscricao")
	private Long id;
	
	@Column(name = "nu_ano")
	private Integer ano;

	private Integer idade;
	
	@Column(name = "tp_sexo")
	private Character sexo;

	@Column(name = "no_municipio_insc")
	private String municipio;

	public Inscricao() {
	}

	public Inscricao(Long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return this.getId().toString();
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	@Override
	public boolean isNew() {
		return id == null;
	}

}
