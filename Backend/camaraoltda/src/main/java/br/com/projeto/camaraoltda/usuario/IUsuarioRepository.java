package br.com.projeto.camaraoltda.usuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "usuarioRepo", path = "usuarioRepo")
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

	@Query(value ="select u.* from Usuario u, Curriculo c, Area_Interesse ai, Area a, curriculo_areainteresse ca where a.id_area = ai.id_area and ai.id_area_interesse = ca.id_area_interesse and ca.id_curriculo = c.id_curriculo and c.id_usuario = u.id_usuario and a.id_area = ?1",
			nativeQuery = true)
	List<Usuario> findByAreaVaga(String area);
}
