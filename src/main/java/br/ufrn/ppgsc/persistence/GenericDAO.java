package br.ufrn.ppgsc.persistence;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;

import br.ufrn.ppgsc.repositorio.IDAO;

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
	
	public void save(Model model) {
		session.save(model);
	}

	@SuppressWarnings("unchecked")
	public Model load(ID id) {
		return (Model) this.session.load(oClass, id);
	}

	public void update(Model model) {
		this.session.update(model);
	}

	public void delete(Model model) {
		this.session.delete(model);
	}
	
	@SuppressWarnings("unchecked")
	public List<Model> listAll() {
		return this.session.createCriteria(oClass).list();
	}

}
