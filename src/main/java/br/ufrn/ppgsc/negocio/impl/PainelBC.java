package br.ufrn.ppgsc.negocio.impl;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.ufrn.ppgsc.dominio.UnidadeFederativa;
import br.ufrn.ppgsc.exceptions.DatabaseException;
import br.ufrn.ppgsc.negocio.IPainelBC;
import br.ufrn.ppgsc.persistencia.IInscricaoDAO;

@Component
public class PainelBC implements IPainelBC {

	protected IInscricaoDAO dao;
	
	public PainelBC(IInscricaoDAO dao) {
		this.dao = dao;
	}
	
	public List<Object> calcularMediaIdade(UnidadeFederativa uf) throws DatabaseException {
		List<Object> list = dao.buscarMediaIdadePorUF(uf);
		return list;
	}
}
