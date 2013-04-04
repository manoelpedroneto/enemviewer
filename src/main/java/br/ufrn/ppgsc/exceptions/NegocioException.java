package br.ufrn.ppgsc.exceptions;

public class NegocioException extends Exception {
	
	public NegocioException(Exception e) {
		super(e);
	}

	public NegocioException(String msg) {
		super(msg);
	}
	
	public NegocioException(String msg, Exception e) {
		super(msg, e);
	}

}
