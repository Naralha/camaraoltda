package br.com.projeto.camaraoltda.usuario;

import java.util.List;

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
@RequestMapping(value = "/usuario")
public class UsuarioEndpoint {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findByAreaVaga(@RequestParam(name = "area") String area) {
		List<Usuario> listaUsuarios = usuarioService.findByAreaVaga(area);
		return new ResponseEntity<List<Usuario>>(listaUsuarios, HttpStatus.OK);
	}
}
