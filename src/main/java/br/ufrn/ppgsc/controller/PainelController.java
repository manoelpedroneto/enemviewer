package br.ufrn.ppgsc.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.ufrn.ppgsc.negocio.IInscricaoBC;

@Resource
public class PainelController {
	
	private Result result;
	
	private IInscricaoBC inscricaoBC;
	
	
	public PainelController(Result result, IInscricaoBC business) {
		this.result = result;
		this.inscricaoBC = business;
	}
	
	/** Verifica média de idade dos participantes do ENEM*/
	public void chart(){
		
		/** Médias do RN*/
		List<Object> mediasRN = inscricaoBC.calcularMediaIdadeRN();
		result.include("mediasRN", mediasRN);
		
		//TODO: Próximo gráfico do painel...
		
	}


}
