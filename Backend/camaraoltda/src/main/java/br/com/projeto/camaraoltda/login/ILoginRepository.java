package br.com.projeto.camaraoltda.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "login", path = "login")
public interface ILoginRepository extends JpaRepository<Login, Integer>{

	Login findByEmail(String email);
}
