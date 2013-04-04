package br.ufrn.ppgsc.persistencia.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import br.ufrn.ppgsc.exceptions.DatabaseException;
import br.ufrn.ppgsc.persistencia.IDAO;

public class GenericDAO<Model, ID extends Number> implements IDAO<Model, ID>  {

	private final Session session;
	private final Class<Model> oClass;

	@SuppressWarnings("unchecked")
	public GenericDAO(Session session) {
		this.session = session;
		this.oClass = (Class<Model>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	protected Session getSession() {
		return session;
	}

	public void save(Model model) throws DatabaseException {
		try {
			session.save(model);
		}catch (HibernateException e) {
			throw new DatabaseException("Erro ao persistir dados no banco.", e);
		}
	}

	@SuppressWarnings("unchecked")
	public Model load(ID id) throws DatabaseException {
		try{
			return (Model) this.session.load(oClass, id);
		}catch (HibernateException e) {
			throw new DatabaseException("Erro ao carregar dados do banco.", e);
		}
	}

	public void update(Model model) throws DatabaseException {
		try {
			this.session.update(model);
		}catch (HibernateException e) {
			throw new DatabaseException("Erro ao atualizar dados no banco.", e);
		}
	}

	public void delete(Model model) throws DatabaseException {
		try {
			this.session.delete(model);
		}catch (HibernateException e) {
			throw new DatabaseException("Erro ao remover dados do banco.", e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<Model> listAll() throws DatabaseException {
		try {
			return this.session.createCriteria(oClass).list();
		}catch (HibernateException e) {
			throw new DatabaseException("Erro ao carregar dados do banco.", e);
		}
	}

}
