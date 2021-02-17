package br.com.projeto.camaraoltda.perfil;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.com.projeto.camaraoltda.perfil.areaInteresse.AreaInteresse;
import br.com.projeto.camaraoltda.perfil.competencia.Competencia;
import br.com.projeto.camaraoltda.perfil.experiencia.Experiencia;
import br.com.projeto.camaraoltda.perfil.formacao.Formacao;
import br.com.projeto.camaraoltda.potencialMatch.PotencialMatch;
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
	private String enderecoImagem;
	
	@OneToMany(mappedBy="perfil")
	private List<Formacao> formacoes;
	
	@OneToMany(mappedBy="perfil")
	private List<Experiencia> experiencias;
	
	@ManyToMany
	@JoinTable(name = "PERFIL_COMPETENCIA",
            joinColumns={@JoinColumn(name="ID_PERFIL",  
            referencedColumnName="ID_PERFIL")},  
            inverseJoinColumns={@JoinColumn(name="ID_COMPETENCIA",   
            referencedColumnName="ID_COMPETENCIA")})
	private List<Competencia> competencias;
	
	@ManyToMany
	@JoinTable(name = "PERFIL_AREAINTERESSE",
            joinColumns={@JoinColumn(name="ID_PERFIL",  
            referencedColumnName="ID_PERFIL")},  
            inverseJoinColumns={@JoinColumn(name="ID_AREA_INTERESSE",   
            referencedColumnName="ID_AREA_INTERESSE")})
	private List<AreaInteresse> areaInteresses;
	
	@OneToMany(mappedBy="perfil")
	private List<PotencialMatch> potencialMatchs;
	
}
