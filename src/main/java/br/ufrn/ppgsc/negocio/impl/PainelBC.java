package br.ufrn.ppgsc.negocio.impl;

import br.com.caelum.vraptor.ioc.Component;
import br.ufrn.ppgsc.negocio.IPainelBC;
import br.ufrn.ppgsc.persistencia.IInscricaoDAO;

@Component
public class PainelBC implements IPainelBC {

	protected IInscricaoDAO dao;
	
	public PainelBC(IInscricaoDAO dao) {
		this.dao = dao;
	}
	
}
