package br.ufrn.ppgsc.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.ufrn.ppgsc.negocio.IInscricaoBC;

@Resource
public class ImportadorController {
	
	private Result result;
	
	private IInscricaoBC inscricaoBC;
	
	
	public ImportadorController(Result result, IInscricaoBC inscBC) {
		this.result = result;
		this.inscricaoBC = inscBC;
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
