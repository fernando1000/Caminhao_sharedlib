package br.com.consigaz.caminhao_sharedlib.modelo;

public class Retorno_ultima_nota_emitida {

	private int cod_registro;
	private String nr_pda;
	private int cod_estabel;
	private String serie;
	private String ult_nr_nota_fis;
	
	
	public static final String COLUMN_INTEGER_COD_REGISTRO = "cod_registro";
	public static final String COLUMN_TEXT_NR_PDA = "nr_pda";
	public static final String COLUMN_INTEGER_COD_ESTABEL = "cod_estabel";
	public static final String COLUMN_TEXT_SERIE = "serie";
	public static final String COLUMN_TEXT_ULT_NR_NOTA_FIS = "ult_nr_nota_fis";

	
	
	public int getCod_registro() {
		return cod_registro;
	}
	public void setCod_registro(int cod_registro) {
		this.cod_registro = cod_registro;
	}
	public String getNr_pda() {
		return nr_pda;
	}
	public void setNr_pda(String nr_pda) {
		this.nr_pda = nr_pda;
	}
	public int getCod_estabel() {
		return cod_estabel;
	}
	public void setCod_estabel(int cod_estabel) {
		this.cod_estabel = cod_estabel;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getUlt_nr_nota_fis() {
		return ult_nr_nota_fis;
	}
	public void setUlt_nr_nota_fis(String ult_nr_nota_fis) {
		this.ult_nr_nota_fis = ult_nr_nota_fis;
	}
}
