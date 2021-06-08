package br.com.projeto.camaraoltda.security;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface IGeneratorJWT {

	String builder(Map<String, Object> claims);
	void validarJwt(HttpServletRequest request) throws Exception;
}
