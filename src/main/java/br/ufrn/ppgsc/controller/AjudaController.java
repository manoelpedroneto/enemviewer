package br.ufrn.ppgsc.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class AjudaController {

	private final Result result;

	public AjudaController(Result result) {
		this.result = result;
	}

	public void ajuda() {
		result.include("variable", "VRaptor!");
	}

}