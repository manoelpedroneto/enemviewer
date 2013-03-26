package br.ufrn.ppgsc.negocio;

import java.util.List;

import br.ufrn.ppgsc.dominio.Inscricao;


public interface IInscricaoBC extends IBusinessController<Inscricao>{
	
	/** Conta quantas inscrições foram realizadas. */
	public Long contar();
	
	public List<Inscricao> inscritosComSexo(Character sexo);
	
	public List<Object> calcularMediaIdadeRN();
	
}


