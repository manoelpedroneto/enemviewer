package br.ufrn.ppgsc.negocio;

import java.util.List;

import br.ufrn.ppgsc.dominio.UnidadeFederativa;


public interface IVisualizadorBC {
	
	public List<UnidadeFederativa> listarUnidadesFederativas();
	
	public UnidadeFederativa buscarUF(Long id);
	
	public List<Object> listarSexoInscritosPorUF(UnidadeFederativa uf);
	
}


