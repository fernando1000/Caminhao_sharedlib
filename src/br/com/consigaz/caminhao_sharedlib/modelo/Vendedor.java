package br.com.consigaz.caminhao_sharedlib.modelo;

public class Vendedor {
	
	private int cod_rep;
	private String nome_abrev;
	private double comis_direta;
	
	public static final String COLUMN_INTEGER_COD_REP = "cod_rep";
	public static final String COLUMN_TEXT_NOME_ABREV = "nome_abrev";
	public static final String COLUMN_TEXT_COMIS_DIRETA = "comis_direta";


	
	public int getCod_rep() {
		return cod_rep;
	}
	public void setCod_rep(int cod_rep) {
		this.cod_rep = cod_rep;
	}
	public String getNome_abrev() {
		return nome_abrev;
	}
	public void setNome_abrev(String nome_abrev) {
		this.nome_abrev = nome_abrev;
	}
	public double getComis_direta() {
		return comis_direta;
	}
	public void setComis_direta(double comis_direta) {
		this.comis_direta = comis_direta;
	}	
}
