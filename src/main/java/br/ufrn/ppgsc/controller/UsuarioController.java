package br.ufrn.ppgsc.controller;

import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.ufrn.ppgsc.dominio.Usuario;
import br.ufrn.ppgsc.negocio.IUsuarioBC;

@Resource
public class UsuarioController {
	
	private Result result;
	
	private IUsuarioBC usuarioBC;
	
	private Validator validator;
	
	public UsuarioController(Result result, IUsuarioBC usuarioBC, Validator validator) {
		this.result = result;
		this.usuarioBC = usuarioBC;
		this.validator = validator;
	}
	
	public void form() {
	}
	
	@Post
	public void cadastrar(final Usuario usuario) {
//		validator.checking(new Validations() {{
//			that(!usuario.getNome().isEmpty(), "usuario.nome", "nome.vazio");
//			that(usuario.getEmail().isEmpty(), "usuario.email", "email.invalido");
//			}});
//			validator.onErrorUsePageOf(UsuarioController.class).form();
		
		usuarioBC.cadastrar(usuario);
	}
	
	public void login(){
		result.include("login", null);
	}

}
