package br.com.projeto.camaraoltda.usuario.curriculo.competencia;

import java.util.List;

public interface ICompetenciaDao {

	List<Competencia> findAllFilhoByIdPai(Integer subAreaId);
	
}
