package br.com.projeto.camaraoltda.usuario.curriculo.competencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "areaRepo", path = "areaRepo")
public interface IAreaRepository extends JpaRepository<Area, Integer> {

}
