package br.ufrn.ppgsc.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.ufrn.ppgsc.negocio.IInscricaoBC;

@Resource
public class VisualizadorController {
	
	private Result result;
	
	private IInscricaoBC inscricaoBC;
	
	
	public VisualizadorController(Result result, IInscricaoBC inscBC) {
		this.result = result;
		this.inscricaoBC = inscBC;
	}
	
	public void form(){
	}
	
	/** Visualizar gráfico conforme seleção dos dados.*/
	public void chart(){
		//TODO: realizar visualização...	
		result.include("msg", "Visualizaçãoo realizada com sucesso.");
	}

}
