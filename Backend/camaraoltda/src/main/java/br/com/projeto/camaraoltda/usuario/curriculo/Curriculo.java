package br.com.projeto.camaraoltda.usuario.curriculo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.projeto.camaraoltda.potencialMatch.PotencialMatch;
import br.com.projeto.camaraoltda.usuario.Usuario;
import br.com.projeto.camaraoltda.usuario.curriculo.competencia.Area;
import br.com.projeto.camaraoltda.usuario.curriculo.competencia.Competencia;
import br.com.projeto.camaraoltda.usuario.curriculo.experiencia.Experiencia;
import lombok.Data;

@Data
@Entity
@Table(name="CURRICULO")
public class Curriculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn
	@Column(name = "ID_CURRICULO")
	private Integer id;
	
	@OneToMany(mappedBy="curriculo")
	private List<Experiencia> experiencias;
	
	@ManyToMany
	@JoinTable(name = "CURRICULO_COMPETENCIA",
            joinColumns={@JoinColumn(name="ID_CURRICULO",  
            referencedColumnName="ID_CURRICULO")},  
            inverseJoinColumns={@JoinColumn(name="ID_COMPETENCIA",   
            referencedColumnName="ID_COMPETENCIA")})
	private List<Competencia> competencias;
	
	@OneToOne
	@JoinColumn(name = "idArea", referencedColumnName = "ID_AREA")
	private Area area;
	
	@OneToMany(mappedBy="curriculo")
	private List<PotencialMatch> potencialMatchs;
	
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	private Usuario usuario;
	
}
