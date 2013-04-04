package br.ufrn.ppgsc.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.ufrn.ppgsc.dominio.UnidadeFederativa;
import br.ufrn.ppgsc.exceptions.DatabaseException;
import br.ufrn.ppgsc.exceptions.NegocioException;
import br.ufrn.ppgsc.negocio.IPainelBC;

@Resource
public class PainelController {
	
	private Result result;
	
	private IPainelBC inscricaoBC;
	
	private Validator validator;
	
	public PainelController(Result result, IPainelBC business, Validator validator) {
		this.result = result;
		this.inscricaoBC = business;
		this.validator = validator;
	}
	
	
	
	/** Verifica média de idade dos participantes do ENEM*/
	public void chart(){
		List<Object> mediasRN = new ArrayList<Object>();
		try {
			
			mediasRN = inscricaoBC.calcularMediaIdade(new UnidadeFederativa("rn"));
			
		} catch (NegocioException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
			result.forwardTo("/WEB-INF/jsp/Painel/chart.jsp");
		} catch (DatabaseException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
			result.forwardTo("/WEB-INF/jsp/Painel/chart.jsp");
		}
		
		result.include("mediasRN", mediasRN);
	}


}
