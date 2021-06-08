package br.com.projeto.camaraoltda.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService{

	@Autowired
	private ILoginRepository loginRepository;
	
	public Login findLoginByEmail(String email) {
		return loginRepository.findByEmail(email);
	}
}
