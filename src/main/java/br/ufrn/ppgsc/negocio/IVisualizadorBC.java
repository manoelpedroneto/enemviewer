package br.ufrn.ppgsc.negocio;

import java.util.List;

import br.ufrn.ppgsc.dominio.UnidadeFederativa;
import br.ufrn.ppgsc.exceptions.DatabaseException;
import br.ufrn.ppgsc.exceptions.NegocioException;


public interface IVisualizadorBC extends IBusinessController  {
	
	public List<UnidadeFederativa> listarUnidadesFederativas() throws NegocioException, DatabaseException;
	
	public UnidadeFederativa buscarUF(Long id) throws NegocioException, DatabaseException;
	
	public List<Object> listarSexoInscritosPorUF(UnidadeFederativa uf) throws NegocioException, DatabaseException;
	
	public List<Object> calcularMediaIdade(UnidadeFederativa uf) throws NegocioException, DatabaseException;
	
}


