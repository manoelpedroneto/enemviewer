package br.ufrn.ppgsc.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.caelum.vraptor.validator.Validations;
import br.ufrn.ppgsc.dominio.Usuario;
import br.ufrn.ppgsc.exceptions.DatabaseException;
import br.ufrn.ppgsc.exceptions.NegocioException;
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

	@Get
	public void login() {		
	}

	@Post
	public void cadastrar(final Usuario usuario) {
		validator.checking(new Validations() {{
			that(!usuario.getNome().isEmpty(), "Nome", "campo.requerido");
			that(!usuario.getEmail().isEmpty(), "E-mail", "campo.requerido");
		}});

		validator.onErrorUsePageOf(UsuarioController.class).form();

		try {

			usuarioBC.cadastrar(usuario);
			result.of(PainelController.class).chart(); //Acesso a a área de gráficos

		} catch (NegocioException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
		} catch (DatabaseException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
		}

		validator.onErrorUsePageOf(UsuarioController.class).form();
	}

	@Post
	public void login(final Usuario usuario){
		validator.checking(new Validations() {{
			that(!usuario.getEmail().isEmpty(), "E-mail", "campo.requerido");
			that(!usuario.getSenha().isEmpty(), "Senha", "campo.requerido");
		}});

		validator.onErrorUsePageOf(UsuarioController.class).login();

		try {

			//TODO: criptografar senha na próxima interação
			Usuario usuarioOn = usuarioBC.login(usuario.getEmail(), usuario.getSenha());
			result.include("usuario", usuarioOn);
			result.of(PainelController.class).chart();

		} catch (NegocioException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
		} catch (DatabaseException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
		}

		validator.onErrorUsePageOf(UsuarioController.class).login();		
	}

}
