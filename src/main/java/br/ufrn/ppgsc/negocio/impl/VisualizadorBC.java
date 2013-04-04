package br.ufrn.ppgsc.negocio.impl;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.ufrn.ppgsc.dominio.UnidadeFederativa;
import br.ufrn.ppgsc.exceptions.DatabaseException;
import br.ufrn.ppgsc.negocio.IVisualizadorBC;
import br.ufrn.ppgsc.persistencia.IInscricaoDAO;
import br.ufrn.ppgsc.persistencia.IUnidadeFederativaDAO;

@Component
public class VisualizadorBC implements IVisualizadorBC {

	private IUnidadeFederativaDAO daoUF;
	
	private IInscricaoDAO daoInsc;
	
	public VisualizadorBC(IUnidadeFederativaDAO daoUF, IInscricaoDAO daoInsc) {
		this.daoUF = daoUF;
		this.daoInsc = daoInsc;
	}

	@Override
	public UnidadeFederativa buscarUF(Long id) throws DatabaseException {
		return daoUF.load(id);
	}
	
	@Override
	public List<UnidadeFederativa> listarUnidadesFederativas() throws DatabaseException {
		return daoUF.listAll();
	}

	@Override
	public List<Object> listarSexoInscritosPorUF(UnidadeFederativa uf) throws DatabaseException {
		return daoInsc.buscarSexosPorUF(uf);
	}
	
	public List<Object> calcularMediaIdade(UnidadeFederativa uf) throws DatabaseException {
		List<Object> list = daoInsc.buscarMediaIdadePorUF(uf);
		return list;
	}
	
}
