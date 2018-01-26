package br.com.consigaz.caminhao_sharedlib.modelo;

public class Configuracao{
	
	private int versao_app;
	private String url_apk;
	
	
	public int getVersao_app() {
		return versao_app;
	}
	public void setVersao_app(int versao_app) {
		this.versao_app = versao_app;
	}
	public String getUrl_apk() {
		return url_apk;
	}
	public void setUrl_apk(String url_apk) {
		this.url_apk = url_apk;
	}	
}
