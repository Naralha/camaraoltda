package br.com.projeto.camaraoltda.pessoa.perfil.formacao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.com.projeto.camaraoltda.pessoa.perfil.Perfil;
import lombok.Data;

@Data
@Entity
@Table(name="FORMACAO")
public class Formacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_FORMACAO")
	private Integer id;
	
	@Column(name = "FK_PERFIL")
	@ManyToOne
	private Perfil perfil;
	
	@Column(name = "INSTITUTO")
	private String instituto;
	
	@Column(name = "CURSO")
	private String curso;
	
	@Column(name = "DT_INICIO")
	private Date dataInicio;
	
	@Column(name = "DT_FIM")
	private Date dataFim;
	
	//criar enum
	@Column(name = "STATUS")
	private String Status;
}
