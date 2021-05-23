package br.com.projeto.camaraoltda.usuario.curriculo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.projeto.camaraoltda.usuario.curriculo.competencia.Area;

@RepositoryRestResource(collectionResourceRel = "curriculo", path = "curriculo")
public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {

	List<Curriculo> findByArea(Area area);
}
