package br.com.projeto.camaraoltda.usuario.curriculo.formacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.camaraoltda.usuario.Usuario;

@RestController
@CrossOrigin
@RequestMapping(value = "/formacao")
public class FormacaoEndpoint {
	
	@Autowired
	private IFormacaoService formacaoService;
	
	@GetMapping(value = "/navegarUsuarios")
	public ResponseEntity<List<Formacao>> teste() {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		return new ResponseEntity<List<Formacao>>(formacaoService.findFormacaoByUsuario(usuario), HttpStatus.OK);
	}

}
