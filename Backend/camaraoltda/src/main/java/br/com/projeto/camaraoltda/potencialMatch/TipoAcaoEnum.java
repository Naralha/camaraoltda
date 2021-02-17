package br.com.projeto.camaraoltda.potencialMatch;

public enum TipoAcaoEnum {
	SEM_ACAO(0),LIKE(1),DISLIKE(2);
		
	private int b;
	private int[] listaInt = {1,2,3};
	
	private TipoAcaoEnum(int b) {
		this.b = b;
	}
}
