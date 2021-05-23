package br.com.projeto.camaraoltda.usuario.curriculo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.camaraoltda.usuario.curriculo.competencia.Area;

@Service
public class CurriculoService implements ICurriculoService{

	@Autowired
	private CurriculoRepository curriculoRepository;
	
	@Override
	public List<Curriculo> findAll() {
		return curriculoRepository.findAll();
	}
	
	@Override
	public Curriculo save(Curriculo curriculo) {
		return curriculoRepository.save(curriculo);
	}

	@Override
	public List<Curriculo> findByArea(Area area) {
		List<Curriculo> listaCurriculo = curriculoRepository.findByArea(area);
		for(int i = 0;i < listaCurriculo.size();i++) {
			listaCurriculo.get(i).getUsuario().setListaCurriculos(null);
		}
		return listaCurriculo;
	}

}
