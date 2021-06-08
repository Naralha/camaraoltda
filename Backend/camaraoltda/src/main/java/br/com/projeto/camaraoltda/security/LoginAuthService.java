package br.com.projeto.camaraoltda.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson.JacksonFactory;
import com.google.gson.Gson;

import br.com.projeto.camaraoltda.login.ILoginService;

@Service
public class LoginAuthService implements ILoginAuthService{
	
	private final static String CLIENT_ID = "814563106968-8fqjehu1ajcn9dfho9d9i2nfqpnpg76h.apps.googleusercontent.com";
	private static final String APPLICATION_NAME = "Google+ Java Token Verification";
	private static final HttpTransport TRANSPORT = new NetHttpTransport();
	private static final JacksonFactory JSON_FACTORY = new JacksonFactory();
	private static final Gson GSON = new Gson();
	
	@Autowired
	private ILoginService loginService;
	
	
	
	
	@Override
	public GoogleIdToken.Payload autenticarExternalLogin(OAuth2Entity oAuth2Entity) {
		TokenStatus idStatus = new TokenStatus();
        if (oAuth2Entity.getTokenId() != null) {
          // Check that the ID Token is valid.

          Checker checker = new Checker(new String[]{CLIENT_ID}, CLIENT_ID);
          GoogleIdToken.Payload jwt = checker.check(oAuth2Entity.getTokenId());

          if (jwt == null) {
            // This is not a valid token.
            idStatus.setValid(false);
            idStatus.setId("");
            idStatus.setMessage("Invalid ID Token.");
          } else {
        	idStatus.setValid(true);
            String gplusId = (String)jwt.get("sub");
            idStatus.setId(gplusId);
            idStatus.setMessage("ID Token is valid.");
            validarNaBase(jwt);
            return jwt;
          }
        } else {
          idStatus.setMessage("ID Token not provided");
        }
		return null;
	}


	private void validarNaBase(Payload jwt) {
		if(loginService.findLoginByEmail(jwt.getEmail()) != null) {
			
		}else {
			
		}
	}


}
