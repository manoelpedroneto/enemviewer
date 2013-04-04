package br.ufrn.ppgsc.persistencia.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.ufrn.ppgsc.dominio.Usuario;
import br.ufrn.ppgsc.exceptions.DatabaseException;
import br.ufrn.ppgsc.persistencia.IUsuarioDAO;

@Component
public class UsuarioDAO extends GenericDAO<Usuario, Long> implements IUsuarioDAO {

	public UsuarioDAO(Session session) {
		super(session);
	}

	public Usuario login(String login, String senha) throws DatabaseException{
		try {
			String hql = "SELECT u FROM Usuario u " +
					"WHERE u.email=:login AND u.senha=:senha"; 

			Query query = getSession().createQuery(hql);
			query.setString("login", login);
			query.setString("senha", senha);
			query.setMaxResults(1);

			return (Usuario) query.uniqueResult();		
		}catch (HibernateException e) {
			throw new DatabaseException("Erro de acesso ao banco ao realizar login.", e);
		}
	}
	
	@Override
	public void salvar(Usuario usuario) throws DatabaseException {
		try {
			getSession().save(usuario);
		}catch (HibernateException e) {
			throw new DatabaseException("Erro ao cadastrar dados do banco.", e);
		}
	}
	
	public Usuario buscarPorEmail(String email) throws DatabaseException{
		try {
			String hql = "SELECT u FROM Usuario u " +
					"WHERE u.email=:email"; 

			Query query = getSession().createQuery(hql);
			query.setString("email", email);
			query.setMaxResults(1);

			return (Usuario) query.uniqueResult();		
		}catch (HibernateException e) {
			throw new DatabaseException("Erro ao carregar dados do banco.", e);
		}
	}


}
