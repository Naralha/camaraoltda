package br.com.projeto.camaraoltda.fluxoPrincipalEmpresa;

import java.util.List;

import br.com.projeto.camaraoltda.usuario.curriculo.Curriculo;
import br.com.projeto.camaraoltda.vaga.Vaga;
import lombok.Data;

@Data
public class TelaFluxoPrincipalEmpresa {

	private List<Vaga> listaVagas;
	private List<Curriculo> listaCurriculos;
	
}
