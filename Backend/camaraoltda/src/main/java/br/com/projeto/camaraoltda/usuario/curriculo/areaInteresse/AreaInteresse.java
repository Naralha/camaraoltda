package br.com.projeto.camaraoltda.usuario.curriculo.areaInteresse;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.projeto.camaraoltda.usuario.curriculo.competencia.Area;
import lombok.Data;

@Data
@Entity
@Table(name="AREA_INTERESSE")
public class AreaInteresse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_AREA_INTERESSE")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "idArea", referencedColumnName = "ID_AREA")
	private Area area;
	
}
