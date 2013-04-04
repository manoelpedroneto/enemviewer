package br.ufrn.ppgsc.negocio;

import br.ufrn.ppgsc.dominio.Usuario;
import br.ufrn.ppgsc.exceptions.DatabaseException;
import br.ufrn.ppgsc.exceptions.NegocioException;


public interface IUsuarioBC extends IBusinessController  {
	
	public Usuario login(String login, String senha) throws NegocioException, DatabaseException;
	
	public void cadastrar(Usuario usuario) throws NegocioException, DatabaseException;
	
}


