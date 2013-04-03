package br.ufrn.ppgsc.persistencia.impl;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.ufrn.ppgsc.dominio.Usuario;
import br.ufrn.ppgsc.persistencia.IUsuarioDAO;

@Component
public class UsuarioDAO extends GenericDAO<Usuario, Long> implements IUsuarioDAO {

	public UsuarioDAO(Session session) {
		super(session);
	}
	
	public Usuario login(String login, String senha){
		String hql = "SELECT u FROM Usuario u " +
				"WHERE u.email=:login AND u.senha=:senha"; 
		
		Query query = getSession().createQuery(hql);
		query.setString("login", login);
		query.setString("senha", senha);
		query.setMaxResults(1);
		
		return (Usuario) query.uniqueResult();		
	}

	@Override
	public void cadastrar(Usuario usuario) {
		getSession().save(usuario);
	}
}
