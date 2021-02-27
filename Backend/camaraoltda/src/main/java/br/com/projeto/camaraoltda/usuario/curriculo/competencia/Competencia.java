package br.com.projeto.camaraoltda.usuario.curriculo.competencia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name="COMPETENCIA")
public class Competencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_COMPETENCIA")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "ID_AREA")
	@JsonIgnore
	private Area area;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "TIPO")
	private String tipo;
	
}
