package br.ufrn.ppgsc.repositorio;

import java.io.Serializable;
import java.util.List;

public interface IDAO<Model, ID extends Serializable> {

	void save(Model model);
	
	Model load(ID id);

	void update(Model model);

	void delete(Model model);
	
	List<Model> listAll();
}
