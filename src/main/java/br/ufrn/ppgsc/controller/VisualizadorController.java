package br.ufrn.ppgsc.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.ufrn.ppgsc.dominio.UnidadeFederativa;
import br.ufrn.ppgsc.negocio.IVisualizadorBC;

@Resource
public class VisualizadorController {
	
	private Result result;
	
	private IVisualizadorBC visualizadorBC;
	
	
	public VisualizadorController(Result result, IVisualizadorBC visBC) {
		this.result = result;
		this.visualizadorBC = visBC;
	}
	
	public void form(){
		List<UnidadeFederativa> list = visualizadorBC.listarUnidadesFederativas();
		result.include("list", list);
	}
	
	/** Visualizar gráfico conforme seleção dos dados.*/
	public void table(final UnidadeFederativa unidadeFederativa){
		UnidadeFederativa uf = visualizadorBC.buscarUF(unidadeFederativa.getId());
		
		List<Object> list = visualizadorBC.listarSexoInscritosPorUF(uf);
		result.include("list", list);
		result.include("uf", uf);
	}

}
