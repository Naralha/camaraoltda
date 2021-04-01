package br.com.projeto.camaraoltda.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/oauth2")
public class OAuth2Endpoint {
	
	@Autowired
	private ILoginService loginService;
	
	@PostMapping
	public ResponseEntity<String> loginByExternalProvider(@RequestBody OAuth2Entity oAuth2Entity) throws Exception{
		//TODO trocar de string para JWT
		String jwt = loginService.autenticarExternalLogin(oAuth2Entity);
		return new ResponseEntity<String>(jwt, HttpStatus.OK);
	}
}
