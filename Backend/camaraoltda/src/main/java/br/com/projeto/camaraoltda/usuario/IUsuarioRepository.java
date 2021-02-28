package br.com.projeto.camaraoltda.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "usuarioRepo", path = "usuarioRepo")
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

	
}
