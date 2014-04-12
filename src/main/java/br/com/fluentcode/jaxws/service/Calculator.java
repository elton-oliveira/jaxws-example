package br.com.fluentcode.jaxws.service;

import javax.jws.WebService;

@WebService
public class Calculator {
	
	public int add(int x, int y){
		return x + y;
	}

}
