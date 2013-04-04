package br.ufrn.ppgsc.persistencia;

import java.io.Serializable;
import java.util.List;

import br.ufrn.ppgsc.exceptions.DatabaseException;

public interface IDAO<Model, ID extends Serializable> {

	void save(Model model) throws DatabaseException;
	
	Model load(ID id) throws DatabaseException;

	void update(Model model) throws DatabaseException;

	void delete(Model model) throws DatabaseException;
	
	List<Model> listAll() throws DatabaseException;
}
