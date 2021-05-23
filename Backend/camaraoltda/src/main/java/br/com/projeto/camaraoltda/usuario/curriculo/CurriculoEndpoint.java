package br.com.projeto.camaraoltda.usuario.curriculo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.camaraoltda.usuario.curriculo.competencia.Area;

@RestController
@CrossOrigin
@RequestMapping(value = "/curriculo")
public class CurriculoEndpoint {

	@Autowired
	private ICurriculoService curriculoService;
	private List<Curriculo> listaPerfil = new ArrayList<Curriculo>();
	
	
	@GetMapping
	public ResponseEntity<List<Curriculo>> findAll(){
		
		listaPerfil = curriculoService.findAll();
		
		return new ResponseEntity<List<Curriculo>>(listaPerfil, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Curriculo> save(@RequestBody Curriculo curriculo){
		return new ResponseEntity<Curriculo>(curriculoService.save(curriculo), HttpStatus.OK);
	}
	
	@GetMapping(value = "/area")
	public ResponseEntity<List<Curriculo>> findByArea(){
		Area area = new Area();
		area.setId(2);
		
		return new ResponseEntity<List<Curriculo>>(curriculoService.findByArea(area), HttpStatus.OK);
	}
}

