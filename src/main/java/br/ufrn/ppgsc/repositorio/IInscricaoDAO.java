package br.ufrn.ppgsc.repositorio;

import java.util.List;

import br.ufrn.ppgsc.dominio.Inscricao;


public interface IInscricaoDAO extends IDAO<Inscricao, Long> {
	
	public Long contar();
	
	public List<Inscricao> findBySexo(Character sexo);
	
	public List<Object> findMediaIdadePorMunicipio(String uf);
	
}
