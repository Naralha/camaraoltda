package br.com.projeto.camaraoltda.usuario.curriculo.competencia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="RELACIONAMENTO_COMPETENCIA")
public class RelacionamentoCompetencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_RELACIONAMENTO_COMPETENCIA")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "idFilho", referencedColumnName = "ID_COMPETENCIA")
	private Competencia idFilho;
	
	@OneToOne
	@JoinColumn(name = "idPai", referencedColumnName = "ID_COMPETENCIA")
	private Competencia idPai;
	
}
