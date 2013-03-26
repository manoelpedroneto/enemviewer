package br.ufrn.ppgsc.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.ufrn.ppgsc.dominio.Inscricao;
import br.ufrn.ppgsc.negocio.IInscricaoBC;

@Resource
public class InscricaoController {
	
	private Result result;
	
	private IInscricaoBC inscricaoBC;
	
	
	public InscricaoController(Result result, IInscricaoBC inscBC) {
		this.result = result;
		this.inscricaoBC = inscBC;
	}
	
	public void list(){
		List<Inscricao> all = inscricaoBC.inscritosComSexo('M');		
		result.include("inscricoes", all);
	}

}
