package br.com.projeto.camaraoltda.empresa;

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

import br.com.projeto.camaraoltda.endereco.Endereco;
import br.com.projeto.camaraoltda.login.Login;
import br.com.projeto.camaraoltda.vaga.Vaga;
import lombok.Data;

@Data
@Entity
@Table(name="EMPRESA")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn
	@Column(name = "ID_EMPRESA")
	private Integer id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "NOME_FANTASIA")
	private String nomeFantasia;
	
	@OneToOne
	@JoinColumn(name = "ID_ENDERECO", referencedColumnName = "ID_ENDERECO")
	private Endereco endereco;
	
	@Column(name = "NUMERO_CONTATO")
	private String numeroContato;
	
	@Column(name = "CNPJ")
	private String cnpj;
	
	@OneToMany(mappedBy="empresa")
	private List<Vaga> vagas;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "ID_LOGIN", referencedColumnName = "ID_LOGIN")
	private Login login;
	
}
