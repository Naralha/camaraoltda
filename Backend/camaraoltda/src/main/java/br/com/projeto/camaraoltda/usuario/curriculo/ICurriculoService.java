package br.com.projeto.camaraoltda.usuario.curriculo;

import java.util.List;


public interface ICurriculoService {

	public List<Curriculo> findAll();
	Curriculo save(Curriculo curriculo);
}
