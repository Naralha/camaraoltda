package br.com.projeto.camaraoltda.perfil;

import java.util.List;


public interface IPerfilService {

	public List<Perfil> findAll();

	public Perfil save(Perfil perfil);
}
