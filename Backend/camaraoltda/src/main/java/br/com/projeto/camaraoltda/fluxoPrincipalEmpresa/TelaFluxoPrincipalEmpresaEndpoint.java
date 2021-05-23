package br.com.projeto.camaraoltda.fluxoPrincipalEmpresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.camaraoltda.empresa.Empresa;

@RestController
@CrossOrigin
@RequestMapping(value = "/fluxoPrincipal")
public class TelaFluxoPrincipalEmpresaEndpoint {

	@Autowired
	private ITelaFluxoPrincipalEmpresaService telaFluxoPrincipalEmpresaService;
	
	@GetMapping(value = "/navegarUsuarios")
	public ResponseEntity<TelaFluxoPrincipalEmpresa> navegarUsuarios(@RequestBody Empresa empresa) {
		return new ResponseEntity<TelaFluxoPrincipalEmpresa>(telaFluxoPrincipalEmpresaService.navegarUsuario(empresa), HttpStatus.OK);
	}
}
