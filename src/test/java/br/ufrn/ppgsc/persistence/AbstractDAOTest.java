package br.ufrn.ppgsc.persistence;

import junit.framework.TestCase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class AbstractDAOTest extends TestCase {

	private static SessionFactory sessionFactory;
	protected Session session;
	private Transaction transaction;
	

	@BeforeClass
	public void prepare() throws Exception {
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	}
	
	@AfterClass
    public static void destroy() {
    	sessionFactory.close();
    }

	@Before
	public void setUp() throws Exception {
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
	}

}
