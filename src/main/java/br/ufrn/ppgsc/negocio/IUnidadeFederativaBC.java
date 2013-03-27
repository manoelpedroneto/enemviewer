package br.ufrn.ppgsc.negocio;

import java.util.List;

import br.ufrn.ppgsc.dominio.UnidadeFederativa;


public interface IUnidadeFederativaBC extends IBusinessController<UnidadeFederativa>{
	
	public List<UnidadeFederativa> listarTodas();
	
}


