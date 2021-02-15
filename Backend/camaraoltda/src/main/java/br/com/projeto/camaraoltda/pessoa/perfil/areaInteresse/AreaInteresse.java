package br.com.projeto.camaraoltda.pessoa.perfil.areaInteresse;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.projeto.camaraoltda.pessoa.perfil.Perfil;
import br.com.projeto.camaraoltda.pessoa.perfil.competencia.Competencia;
import br.com.projeto.camaraoltda.pessoa.perfil.experiencia.Experiencia;
import br.com.projeto.camaraoltda.pessoa.perfil.formacao.Formacao;
import lombok.Data;

@Data
@Entity
@Table(name="AREA_INTERESSE")
public class AreaInteresse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_AREA_INTERESSE")
	private Integer id;
	
	@Column(name = "FK_PERFIL")
	@ManyToOne
	private Perfil perfil;
	
	//Criar enum e tabela dominio
	@Column(name = "AREA_INTERESSE")
	private String areaInteresse;
	
	@Column(name = "CARGO")
	private String cargo;
	
	@Column(name = "DT_INICIO")
	private Date dataInicio;
	
	@Column(name = "DT_FIM")
	private Date dataFim;

}
