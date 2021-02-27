package br.com.projeto.camaraoltda.usuario.curriculo.experiencia;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.projeto.camaraoltda.usuario.curriculo.Curriculo;
import lombok.Data;


@Data
@Entity
@Table(name="EXPERIENCIA")
public class Experiencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EXPERIENCIA")
	private Integer id;
	
	@ManyToOne
    @JoinColumn(name = "ID_CURRICULO")
	@JsonIgnore
	private Curriculo curriculo;
	
	@Column(name = "EMPRESA")
	private String empresa;
	
	@Column(name = "CARGO")
	private String cargo;
	
	@Column(name = "DT_INICIO")
	private Date dataInicio;
	
	@Column(name = "DT_FIM")
	private Date dataFim;
	
}
