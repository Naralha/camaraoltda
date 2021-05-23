package br.com.projeto.camaraoltda.usuario.curriculo.formacao;

import java.util.List;

import br.com.projeto.camaraoltda.usuario.Usuario;

public interface IFormacaoService {
	List<Formacao> findFormacaoByUsuario(Usuario usuario);
}
