package br.ufrn.ppgsc.dominio;

import java.io.Serializable;

/**
 * Interface que possibilita o tratamento generalizado de todos os
 * objetos persistentes.
 *
 * @author ilueny santos
 */
public interface IPersistente<PK extends Serializable> extends Serializable {

	void setId(PK id);
	PK getId();
	boolean isNew();

}
