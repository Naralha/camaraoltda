package br.com.projeto.camaraoltda.usuario.curriculo.competencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "competenciaRepo", path = "competenciaRepo")
public interface ICompetenciaRepository extends JpaRepository<Competencia, Integer>{

	List<Competencia> findByAreaAndTipo(Area area, String tipo);
}
