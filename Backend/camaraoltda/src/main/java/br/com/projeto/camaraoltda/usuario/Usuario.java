package br.com.projeto.camaraoltda.usuario;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.projeto.camaraoltda.login.Login;
import br.com.projeto.camaraoltda.usuario.curriculo.Curriculo;
import br.com.projeto.camaraoltda.usuario.curriculo.formacao.Formacao;
import lombok.Data;

@Data
@Entity
@Table(name="USUARIO")
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
	
	@Column(name = "IDADE")
	private String idade;
	
	@OneToMany(mappedBy = "usuario")
	private List<Curriculo> listaCurriculos;
	
	@OneToMany(mappedBy="usuario")
	private List<Formacao> formacoes;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "ID_LOGIN", referencedColumnName = "ID_LOGIN")
	private Login login;
}
