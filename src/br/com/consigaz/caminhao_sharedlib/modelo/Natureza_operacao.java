package br.com.consigaz.caminhao_sharedlib.modelo;

public class Natureza_operacao {
	
	private String nat_operacao;
	private String denominacao;
	private String cod_cfop;
	private String cod_esp;
	private int cd_trib_icm;
	private double aliquota_icm;
	private double perc_red_icm;
	private int subs_trib;
	private int cd_trib_ipi;
	private int cod_mensagem;
	private int emite_duplic;
	private int emite_nome_remetente;
	
	public static final String COLUMN_TEXT_NAT_OPERACAO = "nat_operacao";
	public static final String COLUMN_TEXT_DENOMINACAO = "denominacao";
	public static final String COLUMN_TEXT_COD_CFOP = "cod_cfop";
	public static final String COLUMN_TEXT_COD_ESP = "cod_esp";
	public static final String COLUMN_INTEGER_CD_TRIB_ICM = "cd_trib_icm";
	public static final String COLUMN_TEXT_ALIQUOTA_ICM = "aliquota_icm";
	public static final String COLUMN_TEXT_PERC_RED_ICM = "perc_red_icm";
	public static final String COLUMN_INTEGER_SUBS_TRIB = "subs_trib";
	public static final String COLUMN_INTEGER_CD_TRIB_IPI = "cd_trib_ipi";
	public static final String COLUMN_INTEGER_COD_MENSAGEM = "cod_mensagem";
	public static final String COLUMN_INTEGER_EMITE_DUPLIC = "emite_duplic";
	public static final String COLUMN_INTEGER_EMITE_NOME_REMETENTE = "emite_nome_remetente";


	
	public String getNat_operacao() {
		return nat_operacao;
	}
	public void setNat_operacao(String nat_operacao) {
		this.nat_operacao = nat_operacao;
	}
	public String getDenominacao() {
		return denominacao;
	}
	public void setDenominacao(String denominacao) {
		this.denominacao = denominacao;
	}
	public String getCod_cfop() {
		return cod_cfop;
	}
	public void setCod_cfop(String cod_cfop) {
		this.cod_cfop = cod_cfop;
	}
	public String getCod_esp() {
		return cod_esp;
	}
	public void setCod_esp(String cod_esp) {
		this.cod_esp = cod_esp;
	}
	public int getCd_trib_icm() {
		return cd_trib_icm;
	}
	public void setCd_trib_icm(int cd_trib_icm) {
		this.cd_trib_icm = cd_trib_icm;
	}
	public double getAliquota_icm() {
		return aliquota_icm;
	}
	public void setAliquota_icm(double aliquota_icm) {
		this.aliquota_icm = aliquota_icm;
	}
	public double getPerc_red_icm() {
		return perc_red_icm;
	}
	public void setPerc_red_icm(double perc_red_icm) {
		this.perc_red_icm = perc_red_icm;
	}
	public int getSubs_trib() {
		return subs_trib;
	}
	public void setSubs_trib(int subs_trib) {
		this.subs_trib = subs_trib;
	}
	public int getCd_trib_ipi() {
		return cd_trib_ipi;
	}
	public void setCd_trib_ipi(int cd_trib_ipi) {
		this.cd_trib_ipi = cd_trib_ipi;
	}
	public int getCod_mensagem() {
		return cod_mensagem;
	}
	public void setCod_mensagem(int cod_mensagem) {
		this.cod_mensagem = cod_mensagem;
	}
	public int getEmite_duplic() {
		return emite_duplic;
	}
	public void setEmite_duplic(int emite_duplic) {
		this.emite_duplic = emite_duplic;
	}
	public int getEmite_nome_remetente() {
		return emite_nome_remetente;
	}
	public void setEmite_nome_remetente(int emite_nome_remetente) {
		this.emite_nome_remetente = emite_nome_remetente;
	}

}
