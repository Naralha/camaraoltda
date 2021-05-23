package br.com.projeto.camaraoltda.vaga;

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

import br.com.projeto.camaraoltda.usuario.Usuario;
import br.com.projeto.camaraoltda.usuario.curriculo.Curriculo;
import br.com.projeto.camaraoltda.usuario.curriculo.experiencia.IExperienciaService;
import br.com.projeto.camaraoltda.usuario.curriculo.formacao.IFormacaoService;

@Repository
public class VagaDao implements IVagaDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Autowired
	private IFormacaoService formacaoService;
	@Autowired
	private IExperienciaService experienciaService;
	
	
	//Metodo Pronto pra alguma regra
	@Override
	public List<Curriculo> findCurriculoPorVaga(Vaga vaga) {
		StringBuilder sb = new StringBuilder();
	    sb.append("select c.id_curriculo, u. ");
	    sb.append("from curriculo c, usuario u ");
		sb.append("where c.id_usuario = u.id_usuario ");
		sb.append("and c.id_area = :Area");
			
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("Area", vaga.getArea().getId());
			
//		return namedParameterJdbcTemplate.query(sb.toString(), namedParameters, new CompetenciaRowMapper());
		return null;
	}
	
	public class CurriculoRowMapper implements RowMapper<Curriculo> {
	    @Override
	    public Curriculo mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	Curriculo curriculo = new Curriculo();
	    	Usuario usuario = new Usuario();
	    	
	    	
	    	curriculo.setCompetencias(null);
	    	curriculo.setExperiencias(experienciaService.findByCurriculo(curriculo));
	    	usuario.setFormacoes(formacaoService.findFormacaoByUsuario(usuario));

	    	curriculo.setUsuario(usuario);
	    	
	    	return curriculo;
	    }
}
}
