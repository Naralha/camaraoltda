package br.com.projeto.camaraoltda.vaga;

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
@RequestMapping(value = "/vaga")
public class VagaEndpoint {

	@Autowired
	private IVagaService vagaService;
	
	
	@PostMapping
	public ResponseEntity cadastrarVaga(@RequestBody Vaga vaga) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
