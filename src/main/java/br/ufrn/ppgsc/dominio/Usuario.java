package br.ufrn.ppgsc.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "usuario", schema="public")
@SequenceGenerator(name = "usuario_seq_generator", sequenceName = "usuario_seq")
public class Usuario implements IPersistente<Long> {

	@Id
	@Column(name = "id_usuario", nullable=false, unique=true)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "usuario_seq_generator")
	private Long id;
	
	@NotNull
	@Length(min=0)
	private String nome;
	
	@NotNull
	private String email;
	
	@NotNull
	private String senha;


	public Usuario() {
	}

	public Usuario(Long id) {
		this.id = id;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean isNew() {
		return id == null;
	}

}
