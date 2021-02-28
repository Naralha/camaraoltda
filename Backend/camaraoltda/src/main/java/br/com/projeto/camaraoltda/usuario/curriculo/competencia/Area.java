package br.com.projeto.camaraoltda.usuario.curriculo.competencia;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name="AREA")
public class Area {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn
	@Column(name = "ID_AREA")
	private Integer id;
	
	@Column(name = "NOME_AREA")
	private String nomeArea;
	
	@OneToMany(mappedBy="area")
	@JsonIgnore
	private List<Competencia> listaCompetencias;
}
