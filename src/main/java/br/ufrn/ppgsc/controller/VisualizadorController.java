package br.ufrn.ppgsc.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
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
	
	@Get
	public void sexo(){
		List<UnidadeFederativa> list = new ArrayList<UnidadeFederativa>();
		try {
			
			list = visualizadorBC.listarUnidadesFederativas();
			result.include("ufs", list);
			
		} catch (NegocioException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
			result.forwardTo("/WEB-INF/jsp/visualizador/form.jsp");
		} catch (DatabaseException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
			result.forwardTo("/WEB-INF/jsp/visualizador/form.jsp");
		}
	}
	
	@Post
	public void sexo(final UnidadeFederativa unidadeFederativa){
		UnidadeFederativa uf;
		try {
		
			uf = visualizadorBC.buscarUF(unidadeFederativa.getId());
			List<Object> list = visualizadorBC.listarSexoInscritosPorUF(uf);
			result.include("list", list);
			result.include("uf", uf);
			
			
			List<UnidadeFederativa> ufs = visualizadorBC.listarUnidadesFederativas();
			result.include("ufs", ufs);
			result.of(this).sexo();

		} catch (NegocioException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
			result.forwardTo("/WEB-INF/jsp/visualizador/table.jsp");
		} catch (DatabaseException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
			result.forwardTo("/WEB-INF/jsp/visualizador/table.jsp");
		}
	}
	
	@Get
	public void idade(){
		List<UnidadeFederativa> list = new ArrayList<UnidadeFederativa>();
		try {
			
			list = visualizadorBC.listarUnidadesFederativas();
			result.include("ufs", list);
			
		} catch (NegocioException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
			result.forwardTo("/WEB-INF/jsp/visualizador/form.jsp");
		} catch (DatabaseException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
			result.forwardTo("/WEB-INF/jsp/visualizador/form.jsp");
		}
	}
	
	@Post
	public void idade(final UnidadeFederativa unidadeFederativa) {
		UnidadeFederativa uf;
		try {
		
			uf = visualizadorBC.buscarUF(unidadeFederativa.getId());
			List<Object> list = visualizadorBC.calcularMediaIdade(uf);
			result.include("list", list);
			result.include("uf", uf);
			
			List<UnidadeFederativa> ufs = visualizadorBC.listarUnidadesFederativas();
			result.include("ufs", ufs);
			result.of(this).idade();

		} catch (NegocioException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
			result.forwardTo("/WEB-INF/jsp/visualizador/table.jsp");
		} catch (DatabaseException e) {
			validator.add(new ValidationMessage(e.getMessage(), "Erro"));
			result.forwardTo("/WEB-INF/jsp/visualizador/table.jsp");
		}
	}
		
}
