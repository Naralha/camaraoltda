package br.com.projeto.camaraoltda.usuario.curriculo;

import java.util.List;

import br.com.projeto.camaraoltda.usuario.curriculo.competencia.Area;


public interface ICurriculoService {

	List<Curriculo> findByArea(Area area);
	public List<Curriculo> findAll();
	Curriculo save(Curriculo curriculo);
}
