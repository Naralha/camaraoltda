package br.com.projeto.camaraoltda.vaga;

import java.util.List;

import br.com.projeto.camaraoltda.empresa.Empresa;
import br.com.projeto.camaraoltda.usuario.curriculo.Curriculo;

public interface IVagaService {

	List<Vaga> findVagasByEmpresa(Empresa empresa);
	List<Curriculo> findCurriculoPorVaga(Vaga vaga);
}
