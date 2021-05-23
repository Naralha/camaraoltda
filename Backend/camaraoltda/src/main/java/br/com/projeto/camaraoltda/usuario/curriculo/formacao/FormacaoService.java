package br.com.projeto.camaraoltda.usuario.curriculo.formacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.camaraoltda.usuario.Usuario;

@Service
public class FormacaoService implements IFormacaoService{

	@Autowired
	private IFormacaoRepository formacaoRepository;
	
	@Override
	public List<Formacao> findFormacaoByUsuario(Usuario usuario) {
		return formacaoRepository.findByUsuario(usuario);
	}

}
