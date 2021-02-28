package br.com.projeto.camaraoltda.vaga.criacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.camaraoltda.usuario.curriculo.competencia.Area;
import br.com.projeto.camaraoltda.usuario.curriculo.competencia.IAreaRepository;
import br.com.projeto.camaraoltda.usuario.curriculo.competencia.ICompetenciaDao;
import br.com.projeto.camaraoltda.usuario.curriculo.competencia.ICompetenciaRepository;

@Service
public class CriacaoVagaService implements ICriacaoVagaService{

	@Autowired
	private IAreaRepository areaRepository;
	@Autowired
	private ICompetenciaRepository competenciaRepository;
	@Autowired
	private ICompetenciaDao competenciaDao;
	
	private TelaCriacaoVaga telaCriacaoVaga = new TelaCriacaoVaga();
	private Area area = new Area();
	
	
	@Override
	public TelaCriacaoVaga iniciarTelaCriacaoVaga() {
		telaCriacaoVaga.setListaAreas(areaRepository.findAll());
		return telaCriacaoVaga;
	}
	
	@Override
	public TelaCriacaoVaga carregarSubAreaTelaCriacaoVaga(Integer areaId) {
		this.area.setId(areaId);
		telaCriacaoVaga.setListaSubArea(competenciaRepository.findByAreaAndTipo(this.area,"S"));
		return telaCriacaoVaga;
	}

	@Override
	public TelaCriacaoVaga carregarCompetenciasTelaCriacaoVaga(Integer subAreaId) {
		telaCriacaoVaga.setCompetencias(competenciaDao.findAllFilhoByIdPai(subAreaId));
		
		for(int i=0;i<telaCriacaoVaga.getCompetencias().size();i++) {
			telaCriacaoVaga.getCompetencias().addAll(competenciaDao.findAllFilhoByIdPai(telaCriacaoVaga.getCompetencias().get(i).getId()));
		}
		return telaCriacaoVaga;
	}

	@Override
	public TelaCriacaoVaga carregarDiferenciaisTelaCriacaoVaga(Integer areaId) {
		this.area.setId(areaId);
		telaCriacaoVaga.setListaSubArea(competenciaRepository.findByAreaAndTipo(this.area,"C"));
		return telaCriacaoVaga;
	} 
	
	
}
