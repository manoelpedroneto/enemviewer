package br.ufrn.ppgsc.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class HomeController {

	private final Result result;

	public HomeController(Result result) {
		this.result = result;
	}

	public void index() {		
	}

}