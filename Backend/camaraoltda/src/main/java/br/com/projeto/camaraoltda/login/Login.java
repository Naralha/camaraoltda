package br.com.projeto.camaraoltda.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Login")
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn
	@Column(name = "ID_LOGIN")
	private Integer id;
	
	@Column(name = "LOGIN")
	private String login;
	
	@Column(name = "SENHA")
	private String senha;
	
	@Column(name = "TIPO_LOGIN")
	private String tipoLogin;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "AUTH_PROVIDER")
	private AuthenticationProvider authProvider;
	
}
