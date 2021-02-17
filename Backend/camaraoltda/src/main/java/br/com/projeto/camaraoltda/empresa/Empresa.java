package br.com.projeto.camaraoltda.empresa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.com.projeto.camaraoltda.endereco.Endereco;
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
	@JoinColumn(name = "id", referencedColumnName = "ID_ENDERECO")
	private Endereco endereco;
	
	@Column(name = "NUMERO_CONTATO")
	private String numeroContato;
	
	@Column(name = "CNPJ")
	private String cnpj;
	
}
