package br.com.projeto.camaraoltda.perfil.formacao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.projeto.camaraoltda.perfil.Perfil;
import lombok.Data;

@Data
@Entity
@Table(name="FORMACAO")
public class Formacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_FORMACAO")
	private Integer id;
	
	@ManyToOne
    @JoinColumn(name = "ID_PERFIL")
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
