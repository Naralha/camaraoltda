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
	public List<Usuario> findByAreaVaga(String area) {
		StringBuilder sb = new StringBuilder();
		sb.append("select u.* from Usuario u, Curriculo c, Area_Interesse ai, Area a, curriculo_areainteresse ca");
		sb.append(" where a.id_area = ai.id_area");
		sb.append(" and ai.id_area_interesse = ca.id_area_interesse ");
		sb.append(" and ca.id_curriculo = c.id_curriculo ");
		sb.append(" and c.id_usuario = u.id_usuario ");
		sb.append("  and a.id_area = :area");
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("area", Integer.valueOf(area));
		
		return namedParameterJdbcTemplate.query(sb.toString(), namedParameters, new UsuarioRowMapper());
	}
	
	public class UsuarioRowMapper implements RowMapper<Usuario> {
	    @Override
	    public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Usuario usuario = new Usuario();

	        usuario.setId(rs.getInt("ID_USUARIO"));
	        usuario.setIdade(rs.getString("IDADE"));
	        usuario.setEnderecoImagem(rs.getString("IMAGEM"));
	        usuario.setNome(rs.getString("NOME"));
	        
	        return usuario;
	    }
	}
}
