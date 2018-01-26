package br.com.consigaz.caminhao_sharedlib.modelo;

public class Boleto {

	private int nr_embarque;
	private int nr_seq_embarque;
	private String cod_banco;
	private String nom_banco;
	private String compl_1_cod_barra;
	private String compl_2_cod_barra;
	private String cod_tit_acr_bco;
	private String des_local_pagto;
	private String nom_razao_social;
	private String cod_agenc_cod_cedente;
	private String cod_nosso_numero_bco;
	private String cod_espec_docto;
	private String log_confir_sacad;
	private String cod_cart_bcia_bco;
	private String des_sig_indic_econ;
	
	public static final String COLUMN_INTEGER_NR_EMBARQUE = "nr_embarque";
	public static final String COLUMN_INTEGER_NR_SEQ_EMBARQUE = "nr_seq_embarque";
	public static final String COLUMN_TEXT_COD_BANCO = "cod_banco";
	public static final String COLUMN_TEXT_NOM_BANCO = "nom_banco";
	public static final String COLUMN_TEXT_COMPL_1_COD_BARRA = "compl_1_cod_barra";
	public static final String COLUMN_TEXT_COMPL_2_COD_BARRA = "compl_2_cod_barra";
	public static final String COLUMN_TEXT_COD_TIT_ACR_BCO = "cod_tit_acr_bco";
	public static final String COLUMN_TEXT_DES_LOCAL_PAGTO = "des_local_pagto";
	public static final String COLUMN_TEXT_NOM_RAZAO_SOCIAL = "nom_razao_social";
	public static final String COLUMN_TEXT_COD_AGENC_COD_CEDENTE = "cod_agenc_cod_cedente";
	public static final String COLUMN_TEXT_COD_NOSSO_NUMERO_BCO = "cod_nosso_numero_bco";
	public static final String COLUMN_TEXT_COD_ESPEC_DOCTO = "cod_espec_docto";
	public static final String COLUMN_TEXT_LOG_CONFIR_SACAD = "log_confir_sacad";
	public static final String COLUMN_TEXT_COD_CART_BCIA_BCO = "cod_cart_bcia_bco";
	public static final String COLUMN_TEXT_DES_SIG_INDIC_ECON = "des_sig_indic_econ";

	
	
	public int getNr_embarque() {
		return nr_embarque;
	}
	public void setNr_embarque(int nr_embarque) {
		this.nr_embarque = nr_embarque;
	}
	public int getNr_seq_embarque() {
		return nr_seq_embarque;
	}
	public void setNr_seq_embarque(int nr_seq_embarque) {
		this.nr_seq_embarque = nr_seq_embarque;
	}
	public String getCod_banco() {
		return cod_banco;
	}
	public void setCod_banco(String cod_banco) {
		this.cod_banco = cod_banco;
	}
	public String getNom_banco() {
		return nom_banco;
	}
	public void setNom_banco(String nom_banco) {
		this.nom_banco = nom_banco;
	}
	public String getCompl_1_cod_barra() {
		return compl_1_cod_barra;
	}
	public void setCompl_1_cod_barra(String compl_1_cod_barra) {
		this.compl_1_cod_barra = compl_1_cod_barra;
	}
	public String getCompl_2_cod_barra() {
		return compl_2_cod_barra;
	}
	public void setCompl_2_cod_barra(String compl_2_cod_barra) {
		this.compl_2_cod_barra = compl_2_cod_barra;
	}
	public String getCod_tit_acr_bco() {
		return cod_tit_acr_bco;
	}
	public void setCod_tit_acr_bco(String cod_tit_acr_bco) {
		this.cod_tit_acr_bco = cod_tit_acr_bco;
	}
	public String getDes_local_pagto() {
		return des_local_pagto;
	}
	public void setDes_local_pagto(String des_local_pagto) {
		this.des_local_pagto = des_local_pagto;
	}
	public String getNom_razao_social() {
		return nom_razao_social;
	}
	public void setNom_razao_social(String nom_razao_social) {
		this.nom_razao_social = nom_razao_social;
	}
	public String getCod_agenc_cod_cedente() {
		return cod_agenc_cod_cedente;
	}
	public void setCod_agenc_cod_cedente(String cod_agenc_cod_cedente) {
		this.cod_agenc_cod_cedente = cod_agenc_cod_cedente;
	}
	public String getCod_nosso_numero_bco() {
		return cod_nosso_numero_bco;
	}
	public void setCod_nosso_numero_bco(String cod_nosso_numero_bco) {
		this.cod_nosso_numero_bco = cod_nosso_numero_bco;
	}
	public String getCod_espec_docto() {
		return cod_espec_docto;
	}
	public void setCod_espec_docto(String cod_espec_docto) {
		this.cod_espec_docto = cod_espec_docto;
	}
	public String getLog_confir_sacad() {
		return log_confir_sacad;
	}
	public void setLog_confir_sacad(String log_confir_sacad) {
		this.log_confir_sacad = log_confir_sacad;
	}
	public String getCod_cart_bcia_bco() {
		return cod_cart_bcia_bco;
	}
	public void setCod_cart_bcia_bco(String cod_cart_bcia_bco) {
		this.cod_cart_bcia_bco = cod_cart_bcia_bco;
	}
	public String getDes_sig_indic_econ() {
		return des_sig_indic_econ;
	}
	public void setDes_sig_indic_econ(String des_sig_indic_econ) {
		this.des_sig_indic_econ = des_sig_indic_econ;
	}
	
}
