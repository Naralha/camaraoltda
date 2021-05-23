package br.com.projeto.camaraoltda.usuario.curriculo.experiencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.projeto.camaraoltda.usuario.curriculo.Curriculo;

@RepositoryRestResource(collectionResourceRel = "experiencia", path = "experiencia")
public interface IExperienciaRepository extends JpaRepository<Experiencia, Integer>{

	List<Experiencia> findByCurriculo(Curriculo curriculo);
}
