package br.com.projeto.camaraoltda.usuario;

import java.util.List;

public interface IUsuarioService {

	List<Usuario> findByAreaVaga(String area);
}
