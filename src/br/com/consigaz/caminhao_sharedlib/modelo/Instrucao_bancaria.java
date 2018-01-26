package br.com.consigaz.caminhao_sharedlib.modelo;


public class Instrucao_bancaria{


	private int cod_instrucao_bcia;
	private String desc_instrucao_bcia;
	
	public static final String COLUMN_INTEGER_COD_INSTRUCAO_BCIA = "cod_instrucao_bcia";
	public static final String COLUMN_TEXT_DESC_INSTRUCAO_BCIA = "desc_instrucao_bcia";


	
	public int getCod_instrucao_bcia() {
		return cod_instrucao_bcia;
	}
	public void setCod_instrucao_bcia(int cod_instrucao_bcia) {
		this.cod_instrucao_bcia = cod_instrucao_bcia;
	}
	public String getDesc_instrucao_bcia() {
		return desc_instrucao_bcia;
	}
	public void setDesc_instrucao_bcia(String desc_instrucao_bcia) {
		this.desc_instrucao_bcia = desc_instrucao_bcia;
	}

}