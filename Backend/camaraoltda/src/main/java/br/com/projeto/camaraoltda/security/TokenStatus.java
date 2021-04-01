package br.com.projeto.camaraoltda.security;

public class TokenStatus {
    public boolean valid;
    public String gplus_id;
    public String message;

    public TokenStatus() {
      valid = false;
      gplus_id = "";
      message = "";
    }

    public void setValid(boolean v) {
      this.valid = v;
    }

    public void setId(String gplus_id) {
      this.gplus_id = gplus_id;
    }

    public void setMessage(String message) {
      this.message = message;
    }
  }
