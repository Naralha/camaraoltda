package br.com.projeto.camaraoltda.pessoa.perfil;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.com.projeto.camaraoltda.pessoa.perfil.areaInteresse.AreaInteresse;
import br.com.projeto.camaraoltda.pessoa.perfil.competencia.Competencia;
import br.com.projeto.camaraoltda.pessoa.perfil.experiencia.Experiencia;
import br.com.projeto.camaraoltda.pessoa.perfil.formacao.Formacao;
import lombok.Data;

@Data
@Entity
@Table(name="PERFIL")
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn
	@Column(name = "ID_PERFIL")
	private Integer id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "IMAGEM")
	private byte[] imagem;
	
	@OneToMany
	private List<Formacao> formacoes;
	
	@OneToMany
	private List<Experiencia> experiencias;
	
	@OneToMany
	private List<Competencia> competencias;
	
	@OneToMany
	private List<AreaInteresse> areaInteresses;
	
}
