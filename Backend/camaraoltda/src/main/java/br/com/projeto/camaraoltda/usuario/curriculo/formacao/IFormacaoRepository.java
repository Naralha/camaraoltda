package br.com.projeto.camaraoltda.usuario.curriculo.formacao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.projeto.camaraoltda.usuario.Usuario;

@RepositoryRestResource(collectionResourceRel = "=formacao", path = "formacao")
public interface IFormacaoRepository extends JpaRepository<Formacao, Integer>{

	List<Formacao> findByUsuario(Usuario usuario);
}
