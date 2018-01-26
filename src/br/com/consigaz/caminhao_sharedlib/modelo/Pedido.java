package br.com.consigaz.caminhao_sharedlib.modelo;

import java.io.Serializable;

public class Pedido implements Serializable{
	
	private int nr_embarque;
	private int nr_seq_embarque;
	private int nr_seq_item;
	private int nr_seq_atend;
	private int ind_tip_atend;
	private String pedido_solic;
	private int cod_emitente;
	private String cod_entrega;
	private String nat_operacao;
	private int cod_cond_pag;
	private int cod_rep;
	private int cod_canal_venda;
	private int cod_mensagem;
	private String cod_estabel;
	private int cod_portador;
	private int modalidade;
	private int cod_instrucao_bcia;
	private String it_codigo;
	private double quantidade;
	private double vl_preuni;
	private double vl_preori;
	private String nr_tabpre;
	private String transportador;
	private String dt_vencto;
	
	public static final String COLUMN_INTEGER_NR_EMBARQUE = "nr_embarque";
	public static final String COLUMN_INTEGER_NR_SEQ_EMBARQUE = "nr_seq_embarque";
	public static final String COLUMN_INTEGER_NR_SEQ_ITEM = "nr_seq_item";
	public static final String COLUMN_INTEGER_NR_SEQ_ATEND = "nr_seq_atend";
	public static final String COLUMN_INTEGER_IND_TIP_ATEND = "ind_tip_atend";
	public static final String COLUMN_TEXT_PEDIDO_SOLIC = "pedido_solic";
	public static final String COLUMN_INTEGER_COD_EMITENTE = "cod_emitente";
	public static final String COLUMN_TEXT_COD_ENTREGA = "cod_entrega";
	public static final String COLUMN_TEXT_NAT_OPERACAO = "nat_operacao";
	public static final String COLUMN_INTEGER_COD_COND_PAG = "cod_cond_pag";
	public static final String COLUMN_INTEGER_COD_REP = "cod_rep";
	public static final String COLUMN_INTEGER_COD_CANAL_VENDA = "cod_canal_venda";
	public static final String COLUMN_INTEGER_COD_MENSAGEM = "cod_mensagem";
	public static final String COLUMN_TEXT_COD_ESTABEL = "cod_estabel";
	public static final String COLUMN_INTEGER_COD_PORTADOR = "cod_portador";
	public static final String COLUMN_INTEGER_MODALIDADE = "modalidade";
	public static final String COLUMN_INTEGER_COD_INSTRUCAO_BCIA = "cod_instrucao_bcia";
	public static final String COLUMN_TEXT_IT_CODIGO = "it_codigo";
	public static final String COLUMN_TEXT_QUANTIDADE = "quantidade";
	public static final String COLUMN_TEXT_VL_PREUNI = "vl_preuni";
	public static final String COLUMN_TEXT_VL_PREORI = "vl_preori";
	public static final String COLUMN_TEXT_NR_TABPRE = "nr_tabpre";
	public static final String COLUMN_TEXT_TRANSPORTADOR = "transportador";
	public static final String COLUMN_TEXT_DT_VENCTO = "dt_vencto";


	
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
	public int getNr_seq_atend() {
		return nr_seq_atend;
	}
	public void setNr_seq_atend(int nr_seq_atend) {
		this.nr_seq_atend = nr_seq_atend;
	}
	public int getInd_tip_atend() {
		return ind_tip_atend;
	}
	public void setInd_tip_atend(int ind_tip_atend) {
		this.ind_tip_atend = ind_tip_atend;
	}
	public String getPedido_solic() {
		return pedido_solic;
	}
	public void setPedido_solic(String pedido_solic) {
		this.pedido_solic = pedido_solic;
	}
	public int getCod_emitente() {
		return cod_emitente;
	}
	public void setCod_emitente(int cod_emitente) {
		this.cod_emitente = cod_emitente;
	}
	public String getCod_entrega() {
		return cod_entrega;
	}
	public void setCod_entrega(String cod_entrega) {
		this.cod_entrega = cod_entrega;
	}
	public String getNat_operacao() {
		return nat_operacao;
	}
	public void setNat_operacao(String nat_operacao) {
		this.nat_operacao = nat_operacao;
	}
	public int getCod_cond_pag() {
		return cod_cond_pag;
	}
	public void setCod_cond_pag(int cod_cond_pag) {
		this.cod_cond_pag = cod_cond_pag;
	}
	public int getCod_rep() {
		return cod_rep;
	}
	public void setCod_rep(int cod_rep) {
		this.cod_rep = cod_rep;
	}
	public int getCod_canal_venda() {
		return cod_canal_venda;
	}
	public void setCod_canal_venda(int cod_canal_venda) {
		this.cod_canal_venda = cod_canal_venda;
	}
	public int getCod_mensagem() {
		return cod_mensagem;
	}
	public void setCod_mensagem(int cod_mensagem) {
		this.cod_mensagem = cod_mensagem;
	}
	public String getCod_estabel() {
		return cod_estabel;
	}
	public void setCod_estabel(String cod_estabel) {
		this.cod_estabel = cod_estabel;
	}
	public int getCod_portador() {
		return cod_portador;
	}
	public void setCod_portador(int cod_portador) {
		this.cod_portador = cod_portador;
	}
	public int getModalidade() {
		return modalidade;
	}
	public void setModalidade(int modalidade) {
		this.modalidade = modalidade;
	}
	public int getCod_instrucao_bcia() {
		return cod_instrucao_bcia;
	}
	public void setCod_instrucao_bcia(int cod_instrucao_bcia) {
		this.cod_instrucao_bcia = cod_instrucao_bcia;
	}
	public String getIt_codigo() {
		return it_codigo;
	}
	public void setIt_codigo(String it_codigo) {
		this.it_codigo = it_codigo;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getVl_preuni() {
		return vl_preuni;
	}
	public void setVl_preuni(double vl_preuni) {
		this.vl_preuni = vl_preuni;
	}
	public double getVl_preori() {
		return vl_preori;
	}
	public void setVl_preori(double vl_preori) {
		this.vl_preori = vl_preori;
	}
	public String getNr_tabpre() {
		return nr_tabpre;
	}
	public void setNr_tabpre(String nr_tabpre) {
		this.nr_tabpre = nr_tabpre;
	}
	public String getTransportador() {
		return transportador;
	}
	public void setTransportador(String transportador) {
		this.transportador = transportador;
	}
	public String getDt_vencto() {
		return dt_vencto;
	}
	public void setDt_vencto(String dt_vencto) {
		this.dt_vencto = dt_vencto;
	}

}
