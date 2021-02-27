package br.com.projeto.camaraoltda.usuario.curriculo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurriculoService implements ICurriculoService{

	@Autowired
	private PerfilRepository perfilRepository;
	
	@Override
	public List<Curriculo> findAll() {
		return perfilRepository.findAll();
	}
	
	@Override
	public Curriculo save(Curriculo curriculo) {
		return perfilRepository.save(curriculo);
	}

}
