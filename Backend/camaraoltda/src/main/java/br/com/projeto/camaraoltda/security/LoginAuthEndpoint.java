package br.com.projeto.camaraoltda.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;

@RestController
@CrossOrigin
@RequestMapping(value = "/loginAuth")
public class LoginAuthEndpoint {

	@Autowired
	private LoginAuthService loginAuthService;
	
	@Autowired
	private GeneratorJWT generatorJWT;
	
//	@PostMapping(value = "/googleLoginAuth")
//	public ResponseEntity<GoogleIdToken.Payload> loginByExternalProvider(@RequestBody OAuth2Entity oAuth2Entity) throws Exception{
//		//TODO trocar de string para JWT
//		GoogleIdToken.Payload jwt = loginAuthService.autenticarExternalLogin(oAuth2Entity);
//		return new ResponseEntity<GoogleIdToken.Payload>(jwt, HttpStatus.OK);
//	}
	@PostMapping(value = "/googleLoginAuth")
	public ResponseEntity<String> loginByExternalProvider(@RequestBody OAuth2Entity oAuth2Entity) throws Exception{
		GoogleIdToken.Payload jwt = loginAuthService.autenticarExternalLogin(oAuth2Entity);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("login", jwt);
		return new ResponseEntity<String>(generatorJWT.builder(map), HttpStatus.OK);
	}
	
//	@PostMapping(value = "/recrutadorLoginAuth")
//	public ResponseEntity<String> recrutadorLoginAuth(@RequestBody OAuth2Entity oAuth2Entity) throws Exception{
//		GoogleIdToken.Payload jwt = loginAuthService.autenticarBaseLogin(oAuth2Entity);
//		Map<String, Object> map = new HashMap<String,Object>();
//		map.put("login", jwt);
//		return new ResponseEntity<String>(generatorJWT.builder(map), HttpStatus.OK);
//	}
	
}
