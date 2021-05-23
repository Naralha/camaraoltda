package br.com.projeto.camaraoltda.usuario.curriculo.experiencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.camaraoltda.usuario.curriculo.Curriculo;
import br.com.projeto.camaraoltda.usuario.curriculo.formacao.Formacao;

@RestController
@CrossOrigin
@RequestMapping(value = "/experiencia")
public class ExperienciaEndpoint {
	
	@Autowired
	private IExperienciaService experienciaService;

	@GetMapping(value = "/navegarUsuarios")
	public ResponseEntity<List<Experiencia>> teste() {
		Curriculo curriculo= new Curriculo();
		curriculo.setId(2);
		return new ResponseEntity<List<Experiencia>>(experienciaService.findByCurriculo(curriculo), HttpStatus.OK);
	}
}
