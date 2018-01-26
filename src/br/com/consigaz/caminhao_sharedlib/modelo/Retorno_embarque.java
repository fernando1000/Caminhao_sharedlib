package br.com.consigaz.caminhao_sharedlib.modelo;

public class Retorno_embarque {
	
	private int cod_registro;
	private int nr_embarque;
	private String hodometro_inicial;
	private String hodometro_final;
	private String qtd_comb_abastecido;
	private int ticket_inicial_medidor;
	private int ticket_final_medidor;
	private String vl_inicial_medidor;
	private String vl_final_medidor;
	private String perc_inicial_tanque_veiculo;
	private String perc_final_tanque_veiculo;
	
	
	public static final String COLUMN_INTEGER_COD_REGISTRO = "cod_registro";
	public static final String COLUMN_INTEGER_NR_EMBARQUE = "nr_embarque";
	public static final String COLUMN_TEXT_HODOMETRO_INICIAL = "hodometro_inicial";
	public static final String COLUMN_TEXT_HODOMETRO_FINAL = "hodometro_final";
	public static final String COLUMN_TEXT_QTD_COMB_ABASTECIDO = "qtd_comb_abastecido";
	public static final String COLUMN_INTEGER_TICKET_INICIAL_MEDIDOR = "ticket_inicial_medidor";
	public static final String COLUMN_INTEGER_TICKET_FINAL_MEDIDOR = "ticket_final_medidor";
	public static final String COLUMN_TEXT_VL_INICIAL_MEDIDOR = "vl_inicial_medidor";
	public static final String COLUMN_TEXT_VL_FINAL_MEDIDOR = "vl_final_medidor";
	public static final String COLUMN_TEXT_PERC_INICIAL_TANQUE_VEICULO = "perc_inicial_tanque_veiculo";
	public static final String COLUMN_TEXT_PERC_FINAL_TANQUE_VEICULO = "perc_final_tanque_veiculo";

	
	public int getCod_registro() {
		return cod_registro;
	}
	public void setCod_registro(int cod_registro) {
		this.cod_registro = cod_registro;
	}
	public int getNr_embarque() {
		return nr_embarque;
	}
	public void setNr_embarque(int nr_embarque) {
		this.nr_embarque = nr_embarque;
	}
	public String getHodometro_inicial() {
		return hodometro_inicial;
	}
	public void setHodometro_inicial(String hodometro_inicial) {
		this.hodometro_inicial = hodometro_inicial;
	}
	public String getHodometro_final() {
		return hodometro_final;
	}
	public void setHodometro_final(String hodometro_final) {
		this.hodometro_final = hodometro_final;
	}
	public String getQtd_comb_abastecido() {
		return qtd_comb_abastecido;
	}
	public void setQtd_comb_abastecido(String qtd_comb_abastecido) {
		this.qtd_comb_abastecido = qtd_comb_abastecido;
	}
	public int getTicket_inicial_medidor() {
		return ticket_inicial_medidor;
	}
	public void setTicket_inicial_medidor(int ticket_inicial_medidor) {
		this.ticket_inicial_medidor = ticket_inicial_medidor;
	}
	public int getTicket_final_medidor() {
		return ticket_final_medidor;
	}
	public void setTicket_final_medidor(int ticket_final_medidor) {
		this.ticket_final_medidor = ticket_final_medidor;
	}
	public String getVl_inicial_medidor() {
		return vl_inicial_medidor;
	}
	public void setVl_inicial_medidor(String vl_inicial_medidor) {
		this.vl_inicial_medidor = vl_inicial_medidor;
	}
	public String getVl_final_medidor() {
		return vl_final_medidor;
	}
	public void setVl_final_medidor(String vl_final_medidor) {
		this.vl_final_medidor = vl_final_medidor;
	}
	public String getPerc_inicial_tanque_veiculo() {
		return perc_inicial_tanque_veiculo;
	}
	public void setPerc_inicial_tanque_veiculo(String perc_inicial_tanque_veiculo) {
		this.perc_inicial_tanque_veiculo = perc_inicial_tanque_veiculo;
	}
	public String getPerc_final_tanque_veiculo() {
		return perc_final_tanque_veiculo;
	}
	public void setPerc_final_tanque_veiculo(String perc_final_tanque_veiculo) {
		this.perc_final_tanque_veiculo = perc_final_tanque_veiculo;
	}
}
