package br.ufrn.ppgsc.negocio.impl;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.ufrn.ppgsc.dominio.UnidadeFederativa;
import br.ufrn.ppgsc.negocio.IUnidadeFederativaBC;
import br.ufrn.ppgsc.persistencia.IUnidadeFederativaDAO;

@Component
public class UnidadeFederativaBC implements IUnidadeFederativaBC {

	protected IUnidadeFederativaDAO dao;
	
	public UnidadeFederativaBC(IUnidadeFederativaDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<UnidadeFederativa> listarTodas() {
		return dao.listAll();
	}

	
}
