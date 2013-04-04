package br.ufrn.ppgsc.exceptions;

public class DatabaseException extends Exception {
	
	public DatabaseException(Exception e) {
		super(e);
	}

	public DatabaseException(String msg) {
		super(msg);
	}
	
	public DatabaseException(String msg, Exception e) {
		super(msg, e);
	}

}
