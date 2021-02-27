package br.com.projeto.camaraoltda.usuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "usuarioRepo", path = "usuarioRepo")
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

	
}
