package br.ufrn.ppgsc.persistence;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.ufrn.ppgsc.dominio.Inscricao;
import br.ufrn.ppgsc.repositorio.IInscricaoDAO;

@Component
public class InscricaoDAO extends GenericDAO<Inscricao, Long> implements IInscricaoDAO {

	public InscricaoDAO(Session session) {
		super(session);
	}

	@Override
	public Long contar() {
		return (Long) getSession().createQuery("select count(*) from Inscricao").uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Inscricao> findBySexo(Character sexo) {
		String hql = "select i from Inscricao i where i.sexo = :sexo";
		Query query = getSession().createQuery(hql);
		query.setCharacter("sexo", sexo);
		return query.list();		
	}
	
	@SuppressWarnings("unchecked")
	public List<Object> findMediaIdadePorMunicipio(String uf) {
		String sql = "select no_municipio_insc, round(avg(idade), 1) from enem_" + uf +
				" group by no_municipio_insc ORDER BY round(avg(idade), 1)";
		Query q = getSession().createSQLQuery(sql);
		return q.list();
	}

}
