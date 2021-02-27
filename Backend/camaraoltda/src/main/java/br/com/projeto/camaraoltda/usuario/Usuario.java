package br.com.projeto.camaraoltda.usuario;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import br.com.projeto.camaraoltda.usuario.curriculo.Curriculo;

public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn
	@Column(name = "ID_USUARIO")
	private Integer id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "IMAGEM")
	private String enderecoImagem;
	
	@OneToMany(mappedBy = "usuario")
	private List<Curriculo> listaCurriculo;
}
