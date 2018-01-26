package br.com.consigaz.caminhao_sharedlib.modelo;

import java.io.Serializable;

public class Local_entrega_pedido implements Serializable{
	
	private String cod_entrega;
	private int cod_emitente;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String cgc;
	private String ins_estadual;
	private String ins_municipal;
	private double fator_conv;
	private int emite_somente_rom;
	
	public static final String COLUMN_TEXT_COD_ENTREGA = "cod_entrega";
	public static final String COLUMN_INTEGER_COD_EMITENTE = "cod_emitente";
	public static final String COLUMN_TEXT_ENDERECO = "endereco";
	public static final String COLUMN_TEXT_BAIRRO = "bairro";
	public static final String COLUMN_TEXT_CIDADE = "cidade";
	public static final String COLUMN_TEXT_ESTADO = "estado";
	public static final String COLUMN_TEXT_CEP = "cep";
	public static final String COLUMN_TEXT_CGC = "cgc";
	public static final String COLUMN_TEXT_INS_ESTADUAL = "ins_estadual";
	public static final String COLUMN_TEXT_INS_MUNICIPAL = "ins_municipal";
	public static final String COLUMN_TEXT_FATOR_CONV = "fator_conv";
	public static final String COLUMN_INTEGER_EMITE_SOMENTE_ROM = "emite_somente_rom";


	
	public String getCod_entrega() {
		return cod_entrega;
	}
	public void setCod_entrega(String cod_entrega) {
		this.cod_entrega = cod_entrega;
	}
		
	public int getCod_emitente() {
		return cod_emitente;
	}
	public void setCod_emitente(int cod_emitente) {
		this.cod_emitente = cod_emitente;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCgc() {
		return cgc;
	}
	public void setCgc(String cgc) {
		this.cgc = cgc;
	}
	public String getIns_estadual() {
		return ins_estadual;
	}
	public void setIns_estadual(String ins_estadual) {
		this.ins_estadual = ins_estadual;
	}
	public String getIns_municipal() {
		return ins_municipal;
	}
	public void setIns_municipal(String ins_municipal) {
		this.ins_municipal = ins_municipal;
	}
	public double getFator_conv() {
		return fator_conv;
	}
	public void setFator_conv(double fator_conv) {
		this.fator_conv = fator_conv;
	}
	public int getEmite_somente_rom() {
		return emite_somente_rom;
	}
	public void setEmite_somente_rom(int emite_somente_rom) {
		this.emite_somente_rom = emite_somente_rom;
	}
}
