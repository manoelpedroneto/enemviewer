package br.ufrn.ppgsc.persistencia;

import br.ufrn.ppgsc.dominio.Usuario;


public interface IUsuarioDAO extends IDAO<Usuario, Long> {
	
	public void cadastrar(Usuario usuario);
	
	public Usuario login(String login, String senha);
	
}
