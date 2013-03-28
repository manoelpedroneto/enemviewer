package br.ufrn.ppgsc.persistencia;

import java.util.List;

import br.ufrn.ppgsc.dominio.Inscricao;
import br.ufrn.ppgsc.dominio.UnidadeFederativa;


public interface IInscricaoDAO extends IDAO<Inscricao, Long> {
	
	public List<Object> buscarSexosPorUF(UnidadeFederativa uf);
	
	public List<Object> buscarMediaIdadePorUF(UnidadeFederativa uf);
	
}
