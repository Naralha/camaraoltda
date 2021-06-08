package br.com.projeto.camaraoltda.vaga;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.camaraoltda.empresa.Empresa;
import br.com.projeto.camaraoltda.security.IGeneratorJWT;

@RestController
@CrossOrigin
@RequestMapping(value = "/vaga")
public class VagaEndpoint {

	@Autowired
	private IVagaService vagaService;
	
	@Autowired
	private IGeneratorJWT generatorJWT;
	
//	@GetMapping
//	public ResponseEntity<List<Vaga>> findVagas(@RequestBody Empresa empresa) {
//		return new ResponseEntity<List<Vaga>>(vagaService.findVagasByEmpresa(empresa),HttpStatus.OK);
//	}
	
	@GetMapping
	public ResponseEntity<String> findVagas(@RequestBody Empresa empresa) {
		Map<String, Object> map = (Map<String, Object>) vagaService.findVagasByEmpresa(empresa);
		return new ResponseEntity<String>(generatorJWT.builder(map),HttpStatus.OK);
	}
	
//	@GetMapping
//	public ResponseEntity<List<Vaga>> findVagasReduzido(@RequestBody Empresa empresa) {
//		return new ResponseEntity<List<Vaga>>(vagaService.findVagasByEmpresa(empresa),HttpStatus.OK);
//	}
	
	@PostMapping
	public ResponseEntity cadastrarVaga(@RequestBody Vaga vaga) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
