package br.com.projeto.camaraoltda.vaga;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.projeto.camaraoltda.empresa.Empresa;
import br.com.projeto.camaraoltda.potencialMatch.PotencialMatch;
import br.com.projeto.camaraoltda.usuario.curriculo.competencia.Area;
import br.com.projeto.camaraoltda.usuario.curriculo.competencia.Competencia;
import br.com.projeto.camaraoltda.vaga.vagaenum.RegimeTrabalhoEnum;
import br.com.projeto.camaraoltda.vaga.vagaenum.TipoVagaEnum;
import lombok.Data;

@Data
@Entity
@Table(name="VAGA")
public class Vaga {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn
	@Column(name = "ID_VAGA")
	private Integer id;
	
	@ManyToOne
    @JoinColumn(name = "ID_EMPRESA")
	@JsonIgnore
	private Empresa empresa;
	
	@Column(name = "TITULO")
	private String titutlo;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "STATUS")
	private String status;
//	private TipoStatusVagaEnum status;
	
	@OneToMany(mappedBy="vaga")
	private List<PotencialMatch> potencialMatchs;
	
	@Column(name = "TIPO_VAGA")
	private TipoVagaEnum tipoVaga;//temporaria 0, permaneente 1
	
	@Column(name = "REGIME_TRABALHO")
	private RegimeTrabalhoEnum regimeTrabalho;//clt 0, pj 1.
	
	@OneToOne
	@JoinColumn(name = "idArea", referencedColumnName = "ID_AREA")
	private Area area;
	
	@ManyToMany
	@JoinTable(name = "VAGA_COMPETENCIA",
            joinColumns={@JoinColumn(name="ID_VAGA",  
            referencedColumnName="ID_VAGA")},  
            inverseJoinColumns={@JoinColumn(name="ID_COMPETENCIA",   
            referencedColumnName="ID_COMPETENCIA")})
	private List<Competencia> listaCompetencias;
	
	@ManyToMany
	@JoinTable(name = "VAGA_DIFERENCIAIS",
            joinColumns={@JoinColumn(name="ID_VAGA",  
            referencedColumnName="ID_VAGA")},  
            inverseJoinColumns={@JoinColumn(name="ID_COMPETENCIA",   
            referencedColumnName="ID_COMPETENCIA")})
	private List<Competencia> diferenciais;
	
}
