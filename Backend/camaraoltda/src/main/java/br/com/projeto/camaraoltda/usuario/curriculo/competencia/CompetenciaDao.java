package br.com.projeto.camaraoltda.usuario.curriculo.competencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class CompetenciaDao implements ICompetenciaDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public List<Competencia> findAllFilhoByIdPai(Integer subAreaId) {
	
		StringBuilder sb = new StringBuilder();
	    sb.append("select c.id_competencia, c.descricao from relacionamento_competencia rc, competencia c");
		sb.append(" where rc.id_filho = c.id_competencia");
		sb.append(" and id_pai = :subAreaId");
			
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("subAreaId", Integer.valueOf(subAreaId));
			
		return namedParameterJdbcTemplate.query(sb.toString(), namedParameters, new CompetenciaRowMapper());
	}
		
	public class CompetenciaRowMapper implements RowMapper<Competencia> {
		    @Override
		    public Competencia mapRow(ResultSet rs, int rowNum) throws SQLException {
		    	Competencia competencia = new Competencia();

		        competencia.setId(rs.getInt("ID_COMPETENCIA"));
		        competencia.setDescricao(rs.getString("DESCRICAO"));

		        
		    return competencia;
		    }
	}
	
}
