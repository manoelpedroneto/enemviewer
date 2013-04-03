package br.ufrn.ppgsc.negocio;

import br.ufrn.ppgsc.dominio.Usuario;


public interface IUsuarioBC {
	
	public Usuario login(String login, String senha);
	
	public void cadastrar(Usuario usuario);
	
}


