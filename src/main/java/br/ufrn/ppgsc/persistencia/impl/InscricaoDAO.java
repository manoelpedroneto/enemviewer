package br.ufrn.ppgsc.persistencia.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.ufrn.ppgsc.dominio.Inscricao;
import br.ufrn.ppgsc.dominio.UnidadeFederativa;
import br.ufrn.ppgsc.exceptions.DatabaseException;
import br.ufrn.ppgsc.persistencia.IInscricaoDAO;

@Component
public class InscricaoDAO extends GenericDAO<Inscricao, Long> implements IInscricaoDAO {

	public InscricaoDAO(Session session) {
		super(session);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> buscarSexosPorUF(UnidadeFederativa uf) throws DatabaseException {
		try {
			String sql = "SELECT feminino.no_municipio_insc, feminino.totalf, masculino.totalm  FROM " +
					" (SELECT DISTINCT no_municipio_insc, COUNT(*) AS totalf " +
					"    FROM enem_" + uf.getSigla() +
					"     WHERE tp_sexo = 'F' GROUP BY no_municipio_insc" +
					"    	ORDER BY no_municipio_insc) AS feminino, " +
					" (SELECT DISTINCT no_municipio_insc, COUNT(*) AS totalm " +
					"		FROM enem_"  + uf.getSigla() +
					"  		 WHERE tp_sexo = 'M' GROUP BY no_municipio_insc " +
					"   	   ORDER BY no_municipio_insc) AS masculino " +
					" WHERE feminino.no_municipio_insc = masculino.no_municipio_insc ";

			Query query = getSession().createSQLQuery(sql);
			return query.list();
		}catch (HibernateException e) {
			throw new DatabaseException("Erro ao carregar dados do banco.", e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<Object> buscarMediaIdadePorUF(UnidadeFederativa uf) throws DatabaseException {
		try {
			String sql = "select no_municipio_insc, round(avg(idade), 1) from enem_" + uf.getSigla() +
					" group by no_municipio_insc ORDER BY round(avg(idade), 1)";
			Query q = getSession().createSQLQuery(sql);
			return q.list();
		}catch (HibernateException e) {
			throw new DatabaseException("Erro ao carregar dados do banco.", e);
		}
	}	

}
