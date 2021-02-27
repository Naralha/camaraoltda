package br.com.projeto.camaraoltda.usuario.curriculo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "perfilRepo", path = "perfilRepo")
public interface PerfilRepository extends JpaRepository<Curriculo, Long> {

	
}
