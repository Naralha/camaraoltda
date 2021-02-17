package br.com.projeto.camaraoltda.perfil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService implements IPerfilService{

	@Autowired
	private PerfilRepository perfilRepository;
	
	@Override
	public List<Perfil> findAll() {
		return perfilRepository.findAll();
	}

}
