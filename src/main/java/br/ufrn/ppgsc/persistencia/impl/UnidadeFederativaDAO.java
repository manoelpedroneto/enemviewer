package br.ufrn.ppgsc.persistencia.impl;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.ufrn.ppgsc.dominio.UnidadeFederativa;
import br.ufrn.ppgsc.persistencia.IUnidadeFederativaDAO;

@Component
public class UnidadeFederativaDAO extends GenericDAO<UnidadeFederativa, Long> implements IUnidadeFederativaDAO {

	public UnidadeFederativaDAO(Session session) {
		super(session);
	}

}
