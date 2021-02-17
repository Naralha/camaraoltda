package br.com.projeto.camaraoltda.potencialMatch;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.com.projeto.camaraoltda.perfil.Perfil;
import br.com.projeto.camaraoltda.vaga.Vaga;
import lombok.Data;

@Data
@Entity
@Table(name="POTENCIAL_MATCH")
public class PotencialMatch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn
	@Column(name = "ID_POTENCIAL_MATCH")
	private Integer id;
		
	@ManyToOne
	@JoinColumn(name = "ID_PERFIL")
	private Perfil perfil;
		
	@ManyToOne
	@JoinColumn(name = "ID_VAGA")
	private Vaga vaga;
	
	@Column(name = "CD_EMPRESA_ACAO")
	@Enumerated(EnumType.ORDINAL)
	private TipoAcaoEnum empresaAcao;
	
	@Column(name = "CD_CANDIDATO_ACAO")
	@Enumerated(EnumType.ORDINAL)
	private TipoAcaoEnum candidatoAcao;
	
		
}
