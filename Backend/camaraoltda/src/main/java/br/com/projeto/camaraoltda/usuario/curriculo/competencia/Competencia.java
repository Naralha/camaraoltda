package br.com.projeto.camaraoltda.usuario.curriculo.competencia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="COMPETENCIA")
public class Competencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_COMPETENCIA")
	private Integer id;
	
	@Column(name = "ID_PAI")
	private String idPai;
	
	@Column(name = "TIPO")
	private String tipo;
	
}
