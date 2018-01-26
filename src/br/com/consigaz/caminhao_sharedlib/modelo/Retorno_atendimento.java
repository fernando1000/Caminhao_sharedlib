package br.com.consigaz.caminhao_sharedlib.modelo;

public class Retorno_atendimento {

	private int cod_registro;
	private int nr_embarque;
	private int nr_seq_embarque;
	private int nr_seq_item;
	private int cod_estabel;
	private String it_codigo;
	private int situacao;
	private String qt_atendida;
	private String hr_inicio_atend;
	private String hr_fim_atend;
	private int ind_tip_docto;
	private String serie;
	private String nr_nota_fis;
	private int nr_romaneio;
	private String dt_reprogramacao;
	private int ind_tip_justific;
	private int cod_justific;
	private String nome_recebedor;
	private String hodometro;
	private String perc_inicial_tanque_cli;
	private String perc_final_tanque_cli;
	
	
	public static final String COLUMN_INTEGER_COD_REGISTRO = "cod_registro";
	public static final String COLUMN_INTEGER_NR_EMBARQUE = "nr_embarque";
	public static final String COLUMN_INTEGER_NR_SEQ_EMBARQUE = "nr_seq_embarque";
	public static final String COLUMN_INTEGER_NR_SEQ_ITEM = "nr_seq_item";
	public static final String COLUMN_INTEGER_COD_ESTABEL = "cod_estabel";
	public static final String COLUMN_TEXT_IT_CODIGO = "it_codigo";
	public static final String COLUMN_INTEGER_SITUACAO = "situacao";
	public static final String COLUMN_TEXT_QT_ATENDIDA = "qt_atendida";
	public static final String COLUMN_TEXT_HR_INICIO_ATEND = "hr_inicio_atend";
	public static final String COLUMN_TEXT_HR_FIM_ATEND = "hr_fim_atend";
	public static final String COLUMN_INTEGER_IND_TIP_DOCTO = "ind_tip_docto";
	public static final String COLUMN_TEXT_SERIE = "serie";
	public static final String COLUMN_TEXT_NR_NOTA_FIS = "nr_nota_fis";
	public static final String COLUMN_INTEGER_NR_ROMANEIO = "nr_romaneio";
	public static final String COLUMN_TEXT_DT_REPROGRAMACAO = "dt_reprogramacao";
	public static final String COLUMN_INTEGER_IND_TIP_JUSTIFIC = "ind_tip_justific";
	public static final String COLUMN_INTEGER_COD_JUSTIFIC = "cod_justific";
	public static final String COLUMN_TEXT_NOME_RECEBEDOR = "nome_recebedor";
	public static final String COLUMN_TEXT_HODOMETRO = "hodometro";
	public static final String COLUMN_TEXT_PERC_INICIAL_TANQUE_CLI = "perc_inicial_tanque_cli";
	public static final String COLUMN_TEXT_PERC_FINAL_TANQUE_CLI = "perc_final_tanque_cli";


	
	
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
	public int getNr_seq_embarque() {
		return nr_seq_embarque;
	}
	public void setNr_seq_embarque(int nr_seq_embarque) {
		this.nr_seq_embarque = nr_seq_embarque;
	}
	public int getNr_seq_item() {
		return nr_seq_item;
	}
	public void setNr_seq_item(int nr_seq_item) {
		this.nr_seq_item = nr_seq_item;
	}
	public int getCod_estabel() {
		return cod_estabel;
	}
	public void setCod_estabel(int cod_estabel) {
		this.cod_estabel = cod_estabel;
	}
	public String getIt_codigo() {
		return it_codigo;
	}
	public void setIt_codigo(String it_codigo) {
		this.it_codigo = it_codigo;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public String getQt_atendida() {
		return qt_atendida;
	}
	public void setQt_atendida(String qt_atendida) {
		this.qt_atendida = qt_atendida;
	}
	public String getHr_inicio_atend() {
		return hr_inicio_atend;
	}
	public void setHr_inicio_atend(String hr_inicio_atend) {
		this.hr_inicio_atend = hr_inicio_atend;
	}
	public String getHr_fim_atend() {
		return hr_fim_atend;
	}
	public void setHr_fim_atend(String hr_fim_atend) {
		this.hr_fim_atend = hr_fim_atend;
	}
	public int getInd_tip_docto() {
		return ind_tip_docto;
	}
	public void setInd_tip_docto(int ind_tip_docto) {
		this.ind_tip_docto = ind_tip_docto;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getNr_nota_fis() {
		return nr_nota_fis;
	}
	public void setNr_nota_fis(String nr_nota_fis) {
		this.nr_nota_fis = nr_nota_fis;
	}
	public int getNr_romaneio() {
		return nr_romaneio;
	}
	public void setNr_romaneio(int nr_romaneio) {
		this.nr_romaneio = nr_romaneio;
	}
	public String getDt_reprogramacao() {
		return dt_reprogramacao;
	}
	public void setDt_reprogramacao(String dt_reprogramacao) {
		this.dt_reprogramacao = dt_reprogramacao;
	}
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
	public String getNome_recebedor() {
		return nome_recebedor;
	}
	public void setNome_recebedor(String nome_recebedor) {
		this.nome_recebedor = nome_recebedor;
	}
	public String getHodometro() {
		return hodometro;
	}
	public void setHodometro(String hodometro) {
		this.hodometro = hodometro;
	}
	public String getPerc_inicial_tanque_cli() {
		return perc_inicial_tanque_cli;
	}
	public void setPerc_inicial_tanque_cli(String perc_inicial_tanque_cli) {
		this.perc_inicial_tanque_cli = perc_inicial_tanque_cli;
	}
	public String getPerc_final_tanque_cli() {
		return perc_final_tanque_cli;
	}
	public void setPerc_final_tanque_cli(String perc_final_tanque_cli) {
		this.perc_final_tanque_cli = perc_final_tanque_cli;
	}
}
