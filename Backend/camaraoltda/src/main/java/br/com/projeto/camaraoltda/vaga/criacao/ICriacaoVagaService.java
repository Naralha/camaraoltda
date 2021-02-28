package br.com.projeto.camaraoltda.vaga.criacao;

public interface ICriacaoVagaService {

	TelaCriacaoVaga iniciarTelaCriacaoVaga();
	TelaCriacaoVaga carregarSubAreaTelaCriacaoVaga(Integer areaId);
	TelaCriacaoVaga carregarCompetenciasTelaCriacaoVaga(Integer subAreaId);
	TelaCriacaoVaga carregarDiferenciaisTelaCriacaoVaga(Integer areaId);
}
