package br.ufrn.ppgsc.negocio.impl;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.ufrn.ppgsc.dominio.UnidadeFederativa;
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
	public UnidadeFederativa buscarUF(Long id) {
		return daoUF.load(id);
	}
	
	@Override
	public List<UnidadeFederativa> listarUnidadesFederativas() {
		return daoUF.listAll();
	}

	@Override
	public List<Object> listarSexoInscritosPorUF(UnidadeFederativa uf) {
		return daoInsc.buscarSexosPorUF(uf);
	}
	
}
