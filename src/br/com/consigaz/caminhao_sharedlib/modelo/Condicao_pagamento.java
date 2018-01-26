package br.com.consigaz.caminhao_sharedlib.modelo;

import java.io.Serializable;

public class Condicao_pagamento implements Serializable{
	
	private int cod_cond_pag;
	private String descricao;
	private String nr_tab_finan;
	private int nr_ind_finan;
	private int cod_vencto;
	private int num_parcelas;
	private int prazo_1;
	private int prazo_2;
	private int prazo_3;
	private int prazo_4;
	private int prazo_5;
	private int prazo_6;
	
	public static final String COLUMN_INTEGER_COD_COND_PAG = "cod_cond_pag";
	public static final String COLUMN_TEXT_DESCRICAO = "descricao";
	public static final String COLUMN_TEXT_NR_TAB_FINAN = "nr_tab_finan";
	public static final String COLUMN_INTEGER_NR_IND_FINAN = "nr_ind_finan";
	public static final String COLUMN_INTEGER_COD_VENCTO = "cod_vencto";
	public static final String COLUMN_INTEGER_NUM_PARCELAS = "num_parcelas";
	public static final String COLUMN_INTEGER_PRAZO_1 = "prazo_1";
	public static final String COLUMN_INTEGER_PRAZO_2 = "prazo_2";
	public static final String COLUMN_INTEGER_PRAZO_3 = "prazo_3";
	public static final String COLUMN_INTEGER_PRAZO_4 = "prazo_4";
	public static final String COLUMN_INTEGER_PRAZO_5 = "prazo_5";
	public static final String COLUMN_INTEGER_PRAZO_6 = "prazo_6";


	
	
	
	public int getCod_cond_pag() {
		return cod_cond_pag;
	}
	public void setCod_cond_pag(int cod_cond_pag) {
		this.cod_cond_pag = cod_cond_pag;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNr_tab_finan() {
		return nr_tab_finan;
	}
	public void setNr_tab_finan(String nr_tab_finan) {
		this.nr_tab_finan = nr_tab_finan;
	}
	public int getNr_ind_finan() {
		return nr_ind_finan;
	}
	public void setNr_ind_finan(int nr_ind_finan) {
		this.nr_ind_finan = nr_ind_finan;
	}
	public int getCod_vencto() {
		return cod_vencto;
	}
	public void setCod_vencto(int cod_vencto) {
		this.cod_vencto = cod_vencto;
	}
	public int getNum_parcelas() {
		return num_parcelas;
	}
	public void setNum_parcelas(int num_parcelas) {
		this.num_parcelas = num_parcelas;
	}
	public int getPrazo_1() {
		return prazo_1;
	}
	public void setPrazo_1(int prazo_1) {
		this.prazo_1 = prazo_1;
	}
	public int getPrazo_2() {
		return prazo_2;
	}
	public void setPrazo_2(int prazo_2) {
		this.prazo_2 = prazo_2;
	}
	public int getPrazo_3() {
		return prazo_3;
	}
	public void setPrazo_3(int prazo_3) {
		this.prazo_3 = prazo_3;
	}
	public int getPrazo_4() {
		return prazo_4;
	}
	public void setPrazo_4(int prazo_4) {
		this.prazo_4 = prazo_4;
	}
	public int getPrazo_5() {
		return prazo_5;
	}
	public void setPrazo_5(int prazo_5) {
		this.prazo_5 = prazo_5;
	}
	public int getPrazo_6() {
		return prazo_6;
	}
	public void setPrazo_6(int prazo_6) {
		this.prazo_6 = prazo_6;
	}
	
}
