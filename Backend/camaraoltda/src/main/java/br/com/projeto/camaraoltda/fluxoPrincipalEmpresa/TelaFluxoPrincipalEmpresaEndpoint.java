package br.com.projeto.camaraoltda.fluxoPrincipalEmpresa;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.camaraoltda.empresa.Empresa;
import br.com.projeto.camaraoltda.security.GeneratorJWT;

@RestController
@CrossOrigin
@RequestMapping(value = "/fluxoPrincipal")
public class TelaFluxoPrincipalEmpresaEndpoint {

	@Autowired
	private ITelaFluxoPrincipalEmpresaService telaFluxoPrincipalEmpresaService;
	
	
	
	@GetMapping(value = "/navegarUsuarios")
	public ResponseEntity<Map<String,Object>> navegarUsuarios(@RequestBody Empresa empresa) {
		return new ResponseEntity<Map<String,Object>>(telaFluxoPrincipalEmpresaService.navegarUsuario(empresa), HttpStatus.OK);
	}
}
