package br.com.projeto.camaraoltda.fluxoPrincipalEmpresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.camaraoltda.empresa.Empresa;
import br.com.projeto.camaraoltda.vaga.IVagaService;

@Service	
public class TelaFluxoPrincipalEmpresaService implements ITelaFluxoPrincipalEmpresaService{
	
	@Autowired
	private IVagaService vagaService;
	
	private TelaFluxoPrincipalEmpresa telaFluxoPrincipalEmpresa = new TelaFluxoPrincipalEmpresa();
	
	@Override
	public TelaFluxoPrincipalEmpresa navegarUsuario(Empresa empresa) {
		telaFluxoPrincipalEmpresa.setListaVagas(vagaService.findVagasByEmpresa(empresa));
		telaFluxoPrincipalEmpresa.setListaCurriculos(vagaService.findCurriculoPorVaga(
				telaFluxoPrincipalEmpresa.getListaVagas().get(0)));
		return telaFluxoPrincipalEmpresa;
	}

	
}
