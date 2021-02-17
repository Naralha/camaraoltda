package br.com.projeto.camaraoltda.perfil.areaInteresse;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="AREA_INTERESSE")
public class AreaInteresse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_AREA_INTERESSE")
	private Integer id;
	
	//Criar enum e tabela dominio
	@Column(name = "AREA_INTERESSE")
	private String areaInteresse;
	
}
