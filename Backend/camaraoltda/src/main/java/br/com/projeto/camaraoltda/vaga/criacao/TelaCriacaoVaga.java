package br.com.projeto.camaraoltda.vaga.criacao;

import java.util.List;

import br.com.projeto.camaraoltda.usuario.curriculo.competencia.Area;
import br.com.projeto.camaraoltda.usuario.curriculo.competencia.Competencia;
import lombok.Data;

@Data
public class TelaCriacaoVaga {

	private List<Area> listaAreas;
	private List<Competencia> listaSubArea;
	private List<Competencia> competencias;
	private List<Competencia> diferenciais;
}
