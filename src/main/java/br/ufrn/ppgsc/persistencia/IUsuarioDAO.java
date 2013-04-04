package br.ufrn.ppgsc.persistencia;

import br.ufrn.ppgsc.dominio.Usuario;
import br.ufrn.ppgsc.exceptions.DatabaseException;


public interface IUsuarioDAO extends IDAO<Usuario, Long> {
	
	public void salvar(Usuario usuario) throws DatabaseException;
	
	public Usuario login(String login, String senha) throws DatabaseException;
	
	public Usuario buscarPorEmail(String email) throws DatabaseException;
	
}
