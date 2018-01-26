package br.com.consigaz.caminhao_sharedlib.modelo;

public class Estabelecimento_serie {

	private int cod_estabel;
	private String nr_pda;
	private String serie;
	private String ult_nr_nota_fis;
	private String nome_abrev_empresa;
	private int cod_emitente_estab;
	
	public static final String COLUMN_INTEGER_COD_ESTABEL = "cod_estabel";
	public static final String COLUMN_TEXT_NR_PDA = "nr_pda";
	public static final String COLUMN_TEXT_SERIE = "serie";
	public static final String COLUMN_TEXT_ULT_NR_NOTA_FIS = "ult_nr_nota_fis";
	public static final String COLUMN_TEXT_NOME_ABREV_EMPRESA = "nome_abrev_empresa";
	public static final String COLUMN_INTEGER_COD_EMITENTE_ESTAB = "cod_emitente_estab";


	
	public int getCod_estabel() {
		return cod_estabel;
	}
	public void setCod_estabel(int cod_estabel) {
		this.cod_estabel = cod_estabel;
	}
	public String getNr_pda() {
		return nr_pda;
	}
	public void setNr_pda(String nr_pda) {
		this.nr_pda = nr_pda;
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
	public String getNome_abrev_empresa() {
		return nome_abrev_empresa;
	}
	public void setNome_abrev_empresa(String nome_abrev_empresa) {
		this.nome_abrev_empresa = nome_abrev_empresa;
	}
	public int getCod_emitente_estab() {
		return cod_emitente_estab;
	}
	public void setCod_emitente_estab(int cod_emitente_estab) {
		this.cod_emitente_estab = cod_emitente_estab;
	}

}
