package br.com.projeto.camaraoltda.vaga;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.projeto.camaraoltda.empresa.Empresa;

@RepositoryRestResource(collectionResourceRel = "vaga", path = "vaga")
public interface IVagaRepository extends JpaRepository<Vaga, Integer>{

	List<Vaga> findVagaByEmpresa(Empresa empresa);
}
