package br.ufrn.ppgsc.negocio;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.ufrn.ppgsc.dominio.Inscricao;
import br.ufrn.ppgsc.repositorio.IInscricaoDAO;

@Component
public class InscricaoBC implements IInscricaoBC {

	protected IInscricaoDAO dao;
	
	public InscricaoBC(IInscricaoDAO dao) {
		this.dao = dao;
	}
	
	/** Conta quantas inscrições foram realizadas. */
	public Long contar() {
		return dao.contar();
	}
	
	public List<Inscricao> inscritosComSexo(Character sexo) {
		return dao.findBySexo(sexo);
	}
	
	public List<Object> calcularMediaIdadeRN() {
		List<Object> list = dao.findMediaIdadePorMunicipio("RN");
		return list;
	}
}
