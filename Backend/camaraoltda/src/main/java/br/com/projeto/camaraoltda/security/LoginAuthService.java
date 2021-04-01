package br.com.projeto.camaraoltda.security;

import org.springframework.stereotype.Service;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;

@Service
public class LoginAuthService implements ILoginAuthService{
	private final String CLIENT_ID = "814563106968-8fqjehu1ajcn9dfho9d9i2nfqpnpg76h.apps.googleusercontent.com";

	@Override
	public String autenticarExternalLogin(OAuth2Entity oAuth2Entity) {
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
          }
        } else {
          idStatus.setMessage("ID Token not provided");
        }
		return null;
	}

}
