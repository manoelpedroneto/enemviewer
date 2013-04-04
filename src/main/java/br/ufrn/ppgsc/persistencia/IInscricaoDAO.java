package br.ufrn.ppgsc.persistencia;

import java.util.List;

import br.ufrn.ppgsc.dominio.Inscricao;
import br.ufrn.ppgsc.dominio.UnidadeFederativa;
import br.ufrn.ppgsc.exceptions.DatabaseException;


public interface IInscricaoDAO extends IDAO<Inscricao, Long> {
	
	public List<Object> buscarSexosPorUF(UnidadeFederativa uf) throws DatabaseException;
	
	public List<Object> buscarMediaIdadePorUF(UnidadeFederativa uf) throws DatabaseException;
	
}
