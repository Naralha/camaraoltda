package br.com.projeto.camaraoltda.vaga;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.com.projeto.camaraoltda.empresa.Empresa;
import br.com.projeto.camaraoltda.potencialMatch.PotencialMatch;
import br.com.projeto.camaraoltda.usuario.curriculo.competencia.Area;
import br.com.projeto.camaraoltda.usuario.curriculo.competencia.Competencia;
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
	private Integer tipoVaga;//temporaria 0, permaneente 1
	
	@Column(name = "REGIME_TRABALHO")
	private Integer regimeTrabalho;//clt 0, pj 1.
	
	@OneToOne
	@JoinColumn(name = "idArea", referencedColumnName = "ID_AREA")
	private Area area;
	
	@OneToOne
	@JoinColumn(name = "idCompetencia", referencedColumnName = "ID_COMPETENCIA")
	private Competencia competencia;
	
}
