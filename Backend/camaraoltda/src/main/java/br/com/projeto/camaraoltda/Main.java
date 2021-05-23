package br.com.projeto.camaraoltda;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.projeto.camaraoltda.usuario.Usuario;
import br.com.projeto.camaraoltda.usuario.curriculo.formacao.IFormacaoService;

public class Main {
	@Autowired
	private IFormacaoService formacaoService;
	
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		

	}

}
