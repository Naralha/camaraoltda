package br.com.projeto.camaraoltda.vaga.criacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/criacaoVaga")
public class CriacaoVagaEndpoint {

	@Autowired
	private ICriacaoVagaService criacaoVagaService;
	
	@GetMapping
	public ResponseEntity<TelaCriacaoVaga> iniciarCriacaoVaga() {
		return new ResponseEntity<TelaCriacaoVaga>(criacaoVagaService.iniciarTelaCriacaoVaga(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/subArea")
	public ResponseEntity<TelaCriacaoVaga> carregarSubAreaTelaCriacaoVaga(@RequestParam(name = "area") Integer areaId){
		return new ResponseEntity<TelaCriacaoVaga>(criacaoVagaService.carregarSubAreaTelaCriacaoVaga(areaId), HttpStatus.OK);
	}
	
	@GetMapping(value = "/competencias")
	public ResponseEntity<TelaCriacaoVaga> carregarCompetenciasTelaCriacaoVaga(@RequestParam(name = "subArea") Integer subAreaId){
		return new ResponseEntity<TelaCriacaoVaga>(criacaoVagaService.carregarCompetenciasTelaCriacaoVaga(subAreaId), HttpStatus.OK);
	}
	
	@GetMapping(value = "/diferenciais")
	public ResponseEntity<TelaCriacaoVaga> carregarDiferenciaisTelaCriacaoVaga(@RequestParam(name = "area") Integer areaId){
		return new ResponseEntity<TelaCriacaoVaga>(criacaoVagaService.carregarDiferenciaisTelaCriacaoVaga(areaId), HttpStatus.OK);
	}
}
