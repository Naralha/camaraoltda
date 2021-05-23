package br.com.projeto.camaraoltda.vaga;

import java.util.List;

import br.com.projeto.camaraoltda.usuario.curriculo.Curriculo;

public interface IVagaDao {

	List<Curriculo> findCurriculoPorVaga(Vaga vaga);
}
