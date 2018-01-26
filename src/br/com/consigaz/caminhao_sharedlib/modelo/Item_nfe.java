package br.com.consigaz.caminhao_sharedlib.modelo;

import java.io.Serializable;

public class Item_nfe implements Serializable{
	
	private int cod_estabel;
	private String serie_remessa;
	private String nr_nota_fis_remessa;
	private int nr_seq_fat;
	private String it_codigo;
	private int quantidade;
	
	public static final String COLUMN_INTEGER_COD_ESTABEL = "cod_estabel";
	public static final String COLUMN_TEXT_SERIE_REMESSA = "serie_remessa";
	public static final String COLUMN_TEXT_NR_NOTA_FIS_REMESSA = "nr_nota_fis_remessa";
	public static final String COLUMN_INTEGER_NR_SEQ_FAT = "nr_seq_fat";
	public static final String COLUMN_TEXT_IT_CODIGO = "it_codigo";
	public static final String COLUMN_INTEGER_QUANTIDADE = "quantidade";


	
	public int getCod_estabel() {
		return cod_estabel;
	}
	public void setCod_estabel(int cod_estabel) {
		this.cod_estabel = cod_estabel;
	}
	public String getSerie_remessa() {
		return serie_remessa;
	}
	public void setSerie_remessa(String serie_remessa) {
		this.serie_remessa = serie_remessa;
	}
	public String getNr_nota_fis_remessa() {
		return nr_nota_fis_remessa;
	}
	public void setNr_nota_fis_remessa(String nr_nota_fis_remessa) {
		this.nr_nota_fis_remessa = nr_nota_fis_remessa;
	}
	public int getNr_seq_fat() {
		return nr_seq_fat;
	}
	public void setNr_seq_fat(int nr_seq_fat) {
		this.nr_seq_fat = nr_seq_fat;
	}
	public String getIt_codigo() {
		return it_codigo;
	}
	public void setIt_codigo(String it_codigo) {
		this.it_codigo = it_codigo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


}
