package br.ufrn.ppgsc.persistence;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.ufrn.ppgsc.dominio.Inscricao;

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
		List<Inscricao> list = dao.findBySexo('M');
		assertNotNull("", list);
	}
}
