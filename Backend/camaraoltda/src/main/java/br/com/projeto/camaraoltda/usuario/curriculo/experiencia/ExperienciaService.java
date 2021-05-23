package br.com.projeto.camaraoltda.usuario.curriculo.experiencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.camaraoltda.usuario.curriculo.Curriculo;

@Service
public class ExperienciaService implements IExperienciaService{

	@Autowired
	private IExperienciaRepository experienciaRepository;

	@Override
	public List<Experiencia> findByCurriculo(Curriculo curriculo) {
		return experienciaRepository.findByCurriculo(curriculo);
	}
}
