package br.com.projeto.camaraoltda.security;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.TextCodec;

@Component
public class GeneratorJWT implements IGeneratorJWT{
	
	private String chave = "Yn2kjibddFAWtnPJ2AFlL8WXmohJMCvigQggaEypa5E=";
	
	public String builder(Map<String, Object> claims) {
		String jws =  Jwts.builder()
		        .setClaims(claims)
		        .signWith(
		            SignatureAlgorithm.HS256,
		            TextCodec.BASE64.decode(chave)
		        )
		        .compact();
		return jws;
	}
	
	public void validarJwt(HttpServletRequest request) throws Exception{
		String jwt = request.getHeader("jwt");
		throw new Exception();
	}
}
