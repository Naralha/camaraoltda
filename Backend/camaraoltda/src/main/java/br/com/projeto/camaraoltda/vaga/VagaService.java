package br.com.projeto.camaraoltda.vaga;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.camaraoltda.empresa.Empresa;
import br.com.projeto.camaraoltda.usuario.curriculo.Curriculo;
import br.com.projeto.camaraoltda.usuario.curriculo.ICurriculoService;

@Service
public class VagaService implements IVagaService{
	
	@Autowired
	private IVagaRepository vagaRepository;
	@Autowired
	private ICurriculoService curriculoService;
	@Autowired
	private IVagaDao vagaDao;
	
	public List<Vaga> findVagasByEmpresa(Empresa empresa){
		return vagaRepository.findVagaByEmpresa(empresa);
	}

	@Override
	public List<Curriculo> findCurriculoPorVaga(Vaga vaga) {
		return curriculoService.findByArea(vaga.getArea());
	}
}
