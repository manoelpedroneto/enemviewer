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
import br.ufrn.ppgsc.negocio.IVisualizadorBC;

@Resource
public class VisualizadorController {
	
	private Result result;
	
	private IVisualizadorBC visualizadorBC;
	
	private Validator validator;	
	
	public VisualizadorController(Result result, IVisualizadorBC visBC, Validator validator) {
		this.result = result;
		this.visualizadorBC = visBC;
		this.validator = validator;		
	}
	
	public void form(){
		List<UnidadeFederativa> list = new ArrayList<UnidadeFederativa>();
		try {
			
			list = visualizadorBC.listarUnidadesFederativas();
			result.include("list", list);
			
		} catch (NegocioException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
			result.forwardTo("/WEB-INF/jsp/visualizador/form.jsp");
		} catch (DatabaseException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
			result.forwardTo("/WEB-INF/jsp/visualizador/form.jsp");
		}
	}
	
	/** Visualizar gráfico conforme seleção dos dados.*/
	public void table(final UnidadeFederativa unidadeFederativa){
		UnidadeFederativa uf;
		try {
		
			uf = visualizadorBC.buscarUF(unidadeFederativa.getId());
			List<Object> list = visualizadorBC.listarSexoInscritosPorUF(uf);
			result.include("list", list);
			result.include("uf", uf);

		} catch (NegocioException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
			result.forwardTo("/WEB-INF/jsp/visualizador/table.jsp");
		} catch (DatabaseException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
			result.forwardTo("/WEB-INF/jsp/visualizador/table.jsp");
		}
	}

}
