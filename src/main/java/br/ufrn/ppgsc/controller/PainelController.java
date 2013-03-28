package br.ufrn.ppgsc.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.ufrn.ppgsc.dominio.UnidadeFederativa;
import br.ufrn.ppgsc.negocio.IPainelBC;

@Resource
public class PainelController {
	
	private Result result;
	
	private IPainelBC inscricaoBC;
	
	public PainelController(Result result, IPainelBC business) {
		this.result = result;
		this.inscricaoBC = business;
	}
	
	/** Verifica média de idade dos participantes do ENEM*/
	public void chart(){
		
		/** Médias do RN*/
		List<Object> mediasRN = inscricaoBC.calcularMediaIdade(new UnidadeFederativa("rn"));
		result.include("mediasRN", mediasRN);
		
	}


}
