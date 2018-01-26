package br.com.consigaz.caminhao_sharedlib.enums;

public enum Generico {
		
	ENCONTROU_USUARIO(1),
	NAO_ENCONTROU_USUARIO(0),
	OCORREU_ERRO(666);
	
	
	private int resultado;
	
	public int getValor(){
		return resultado;
	}
	
	private Generico(int _resultado){
		this.resultado = _resultado;
	}
}
