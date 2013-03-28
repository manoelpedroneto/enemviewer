package br.ufrn.ppgsc.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class GraficosController {
	
	private Result result;
	
	public GraficosController(Result result) {
		this.result = result;
	}
	
	public void form() {
		result.include("msg", "Arquivo importado com sucesso.");
	}
	
	/** Realiza a carga dos dados do ENEM.*/
	public void importar(){
		//TODO: realizar importação...	
		result.include("msg", "Arquivo importado com sucesso.");
	}

}
