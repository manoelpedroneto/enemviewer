package br.ufrn.ppgsc.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.ufrn.ppgsc.dominio.UnidadeFederativa;
import br.ufrn.ppgsc.negocio.IUnidadeFederativaBC;

@Resource
public class VisualizadorController {
	
	private Result result;
	
	private IUnidadeFederativaBC unidadeFederativaBC;
	
	
	public VisualizadorController(Result result, IUnidadeFederativaBC ufBC) {
		this.result = result;
		this.unidadeFederativaBC = ufBC;
	}
	
	public void form(){
		List<UnidadeFederativa> list = unidadeFederativaBC.listarTodas();
		result.include("list", list);
	}
	
	/** Visualizar gráfico conforme seleção dos dados.*/
	public void table(){
		result.include("msg", "Visualizaçãoo realizada com sucesso.");
	}

}
