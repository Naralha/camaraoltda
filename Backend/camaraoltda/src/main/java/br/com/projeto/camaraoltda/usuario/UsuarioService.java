package br.com.projeto.camaraoltda.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	public List<Usuario> findByAreaVaga(String area){
		return usuarioRepository.findAllById(usuarioDao.findByAreaVaga(area));
	}
}
