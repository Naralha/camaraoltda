package br.com.projeto.camaraoltda.usuario;

import java.util.List;

public interface IUsuarioDao {

	List<Usuario> findByAreaVaga(String area);
}
