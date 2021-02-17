package br.com.projeto.camaraoltda.pessoa.perfil.experiencia;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.projeto.camaraoltda.pessoa.perfil.Perfil;
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
    @JoinColumn(name = "ID_PERFIL")
	private Perfil perfil;
	
	@Column(name = "EMPRESA")
	private String empresa;
	
	@Column(name = "CARGO")
	private String cargo;
	
	@Column(name = "DT_INICIO")
	private Date dataInicio;
	
	@Column(name = "DT_FIM")
	private Date dataFim;
	
}
