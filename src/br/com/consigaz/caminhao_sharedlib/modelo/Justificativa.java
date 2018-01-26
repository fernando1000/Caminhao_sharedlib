package br.com.consigaz.caminhao_sharedlib.modelo;

public class Justificativa {
	
	private int ind_tip_justific;
	private int cod_justific;
	private String descricao;
	
	public static final String COLUMN_INTEGER_IND_TIP_JUSTIFIC = "ind_tip_justific";
	public static final String COLUMN_INTEGER_COD_JUSTIFIC = "cod_justific";
	public static final String COLUMN_TEXT_DESCRICAO = "descricao";


	
	public int getInd_tip_justific() {
		return ind_tip_justific;
	}
	public void setInd_tip_justific(int ind_tip_justific) {
		this.ind_tip_justific = ind_tip_justific;
	}
	public int getCod_justific() {
		return cod_justific;
	}
	public void setCod_justific(int cod_justific) {
		this.cod_justific = cod_justific;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


}
