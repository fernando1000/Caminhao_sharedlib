package br.com.consigaz.caminhao_sharedlib.modelo;

import java.io.Serializable;

public class Cliente_pedido implements Serializable{
	
	private int cod_emitente;
	private String nome_emit;
	private String id_deb_auto;
	
	public static final String COLUMN_INTEGER_COD_EMITENTE = "cod_emitente";
	public static final String COLUMN_TEXT_NOME_EMIT = "nome_emit";
	public static final String COLUMN_TEXT_ID_DEB_AUTO = "id_deb_auto";


	
	
	
	public int getCod_emitente() {
		return cod_emitente;
	}
	public void setCod_emitente(int cod_emitente) {
		this.cod_emitente = cod_emitente;
	}
	public String getNome_emit() {
		return nome_emit;
	}
	public void setNome_emit(String nome_emit) {
		this.nome_emit = nome_emit;
	}
	public String getId_deb_auto() {
		return id_deb_auto;
	}
	public void setId_deb_auto(String id_deb_auto) {
		this.id_deb_auto = id_deb_auto;
	}

}
