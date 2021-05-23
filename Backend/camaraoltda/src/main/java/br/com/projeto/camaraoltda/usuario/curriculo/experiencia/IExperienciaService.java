package br.com.projeto.camaraoltda.usuario.curriculo.experiencia;

import java.util.List;

import br.com.projeto.camaraoltda.usuario.curriculo.Curriculo;

public interface IExperienciaService {
	List<Experiencia> findByCurriculo(Curriculo curriculo);
}
