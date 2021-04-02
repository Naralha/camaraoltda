package br.com.projeto.camaraoltda.security;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;

public interface ILoginAuthService {

	Payload autenticarExternalLogin(OAuth2Entity oAuth2Entity);
}
