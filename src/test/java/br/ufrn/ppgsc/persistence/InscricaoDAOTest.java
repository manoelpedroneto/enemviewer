package br.ufrn.ppgsc.persistence;

import org.junit.Before;
import org.junit.Test;

import br.ufrn.ppgsc.persistencia.impl.InscricaoDAO;

public class InscricaoDAOTest extends AbstractDAOTest {
	
	private InscricaoDAO dao;

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
		dao = new InscricaoDAO(session);
	}

	@Test
	public void listarPorSexoTest() {
		assertNotNull("", null);
	}
}
