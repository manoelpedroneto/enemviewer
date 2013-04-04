package br.ufrn.ppgsc.negocio;

import java.util.List;

import br.ufrn.ppgsc.dominio.UnidadeFederativa;
import br.ufrn.ppgsc.exceptions.DatabaseException;
import br.ufrn.ppgsc.exceptions.NegocioException;


public interface IPainelBC extends IBusinessController {
	
	public List<Object> calcularMediaIdade(UnidadeFederativa uf) throws NegocioException, DatabaseException;
	
}


