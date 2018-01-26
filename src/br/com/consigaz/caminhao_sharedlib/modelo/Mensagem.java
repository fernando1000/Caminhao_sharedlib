package br.com.consigaz.caminhao_sharedlib.modelo;

public class Mensagem {

	private int cod_mensagem;
	private String texto_mensag;
	
	public static final String COLUMN_INTEGER_COD_MENSAGEM = "cod_mensagem";
	public static final String COLUMN_TEXT_TEXTO_MENSAG = "texto_mensag";


	
	public int getCod_mensagem() {
		return cod_mensagem;
	}
	public void setCod_mensagem(int cod_mensagem) {
		this.cod_mensagem = cod_mensagem;
	}
	public String getTexto_mensag() {
		return texto_mensag;
	}
	public void setTexto_mensag(String texto_mensag) {
		this.texto_mensag = texto_mensag;
	}	
}
