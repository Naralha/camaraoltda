package br.com.projeto.camaraoltda.usuario.curriculo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/perfil")
public class PerfilEndpoint {

	@Autowired
	private IPerfilService perfilService;
	private List<Curriculo> listaPerfil = new ArrayList<Curriculo>();
	
	
	@GetMapping
	public ResponseEntity<List<Curriculo>> findAll(){
		
		listaPerfil = perfilService.findAll();
		
		return new ResponseEntity<List<Curriculo>>(listaPerfil, HttpStatus.OK);
	}
	
////	@PostMapping
////	public ResponseEntity<Obra> salvar(@RequestBody Obra obra){
////		
////		obraService.salvar(obra);
////		
////		return new ResponseEntity<Obra>(obra, HttpStatus.OK);
////	}
//	@PostMapping
//	public ResponseEntity<ResponseStructure<Obra>> salvar(@RequestBody Obra obra){
//		
//		ResponseStructure<Obra> responseStructure = obraService.salvar(obra);
//		
//		return new ResponseEntity<ResponseStructure<Obra>>(responseStructure, responseStructure.getStatus());
//	}
//	
//	
//	@DeleteMapping
//	public ResponseEntity<Obra> delete(@RequestBody Obra obra){
//		
//		obraService.deletar(obra);
//		
//		return new ResponseEntity<Obra>(obra, HttpStatus.OK);
//	}
//	
//	@PutMapping
//	public ResponseEntity<Obra> atualizar(@RequestBody Obra obra){
//		
//		obraService.atualizar(obra);
//		
//		return new ResponseEntity<Obra>(obra, HttpStatus.OK);
//	}
//	
//	@GetMapping(value = "/{id}")
//	public ResponseEntity<Obra> findById(@PathVariable(name = "id") Long id) throws PeidoException{
//		if (obraService.findById(id) == null){
//			throw new PeidoException("findById","N existe Obra com esse ID");
//		}
//		return new ResponseEntity<Obra>(obraService.findById(id), HttpStatus.OK);
//	}
	
	
//	@GetMapping(value = "/duplicidade")
//	public ResponseEntity<Obra> findByDuplicidade(@RequestBody Duplicidade duplicidade) {
//		return new ResponseEntity<Obra>(obraService.findByDuplicidade(duplicidade),HttpStatus.OK);
//	}
	
	
	
	
//	@GetMapping(value = "/1/jdbc")
//	public ResponseEntity<Obra> findObraJdbc(){
//		return new ResponseEntity<Obra>(obraService.findObra(), HttpStatus.OK);
//	}
}

