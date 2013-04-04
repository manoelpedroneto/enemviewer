package br.ufrn.ppgsc.negocio.impl;

import br.com.caelum.vraptor.ioc.Component;
import br.ufrn.ppgsc.dominio.Usuario;
import br.ufrn.ppgsc.exceptions.DatabaseException;
import br.ufrn.ppgsc.exceptions.UsuarioJaCadastradoException;
import br.ufrn.ppgsc.negocio.IUsuarioBC;
import br.ufrn.ppgsc.persistencia.IUsuarioDAO;

@Component
public class UsuarioBC implements IUsuarioBC {

	protected IUsuarioDAO dao;
	
	public UsuarioBC(IUsuarioDAO dao) {
		this.dao = dao;
	}
	
	public Usuario login(String login, String senha) throws DatabaseException {
		return dao.login(login, senha);
	}
	
	public void cadastrar(Usuario usuario) throws DatabaseException, UsuarioJaCadastradoException {
		Usuario u = dao.buscarPorEmail(usuario.getEmail());
		if (u == null)
			dao.salvar(usuario);
		else
			throw new UsuarioJaCadastradoException("Usuário já cadastrado no sistema.");
	}
}
