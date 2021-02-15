package br.com.projeto.camaraoltda.pessoa.perfil;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.projeto.camaraoltda.pessoa.perfil.areaInteresse.AreaInteresse;
import br.com.projeto.camaraoltda.pessoa.perfil.competencia.Competencia;
import br.com.projeto.camaraoltda.pessoa.perfil.experiencia.Experiencia;
import br.com.projeto.camaraoltda.pessoa.perfil.formacao.Formacao;
import lombok.Data;

@Data
@Entity
@Table(name="PERFIL")
public class Perfil {

	private Integer id;
	private String nome;
	private List<Formacao> formacoes;
	private byte[] imagem;
	private List<Experiencia> experiencias;
	private List<Competencia> competencias;
	private List<AreaInteresse> areaInteresses;
	
}
