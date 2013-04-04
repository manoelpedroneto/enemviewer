package br.ufrn.ppgsc.exceptions;

public class UsuarioJaCadastradoException extends NegocioException {
	
	public UsuarioJaCadastradoException(Exception e) {
		super(e);
	}

	public UsuarioJaCadastradoException(String msg) {
		super(msg);
	}
	
	public UsuarioJaCadastradoException(String msg, Exception e) {
		super(msg, e);
	}

}
