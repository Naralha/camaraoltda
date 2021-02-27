package br.com.projeto.camaraoltda.usuario;

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
public class UsuarioDao implements IUsuarioDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<Integer> findByAreaVaga(String area) {
		StringBuilder sb = new StringBuilder();
		sb.append("select u.id_usuario from Usuario u, Curriculo c,  Area a");
		sb.append(" where a.id_area = c.id_area");
		sb.append(" and c.id_usuario = u.id_usuario ");
		sb.append(" and a.id_area = :area");
		
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("area", Integer.valueOf(area));
		
		return namedParameterJdbcTemplate.query(sb.toString(), namedParameters, new IntegerRowMapper());
	}
	
	public class IntegerRowMapper implements RowMapper<Integer> {
	    @Override
	    public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
	        

//	        usuarioÇ.setId();
//	        usuario.setIdade(rs.getString("IDADE"));
//	        usuario.setEnderecoImagem(rs.getString("IMAGEM"));
//	        usuario.setNome(rs.getString("NOME"));
	        
	        return rs.getInt("ID_USUARIO");
	    }
	}
}
