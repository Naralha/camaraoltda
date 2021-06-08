package br.com.projeto.camaraoltda.fluxoPrincipalEmpresa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.camaraoltda.empresa.Empresa;
import br.com.projeto.camaraoltda.security.GeneratorJWT;
import br.com.projeto.camaraoltda.vaga.IVagaService;
import br.com.projeto.camaraoltda.vaga.Vaga;

@Service	
public class TelaFluxoPrincipalEmpresaService implements ITelaFluxoPrincipalEmpresaService{
	
	@Autowired
	private IVagaService vagaService;
	
	@Autowired
	private GeneratorJWT generatorJWT;
	
	@Override
	public Map<String,Object> navegarUsuario(Empresa empresa) {
		Map<String,Object> map = new HashMap<>();
		List<Vaga> listaVaga = vagaService.findVagasByEmpresa(empresa);
		
		map.put("listaVagas", listaVaga);
		map.put("listaCurriculos", vagaService.findCurriculoPorVaga(listaVaga.get(0)));
//		map.put("jwt", generatorJWT.builder());
		
		return map;
	}

	
}
