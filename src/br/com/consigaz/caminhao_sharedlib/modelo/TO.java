package br.com.consigaz.caminhao_sharedlib.modelo;

import java.util.List;

public class TO{
		
	private String nr_pda;
	private int achou_nr_pda;
	private List<Pda> listaPda;	
	private List<Boleto> listaBoleto;
	private List<Cliente_pedido> listaClientePedido;
	private List<Condicao_pagamento> listaCondicaoPagamento;
	private List<Embarque> listaEmbarque;
	private List<Estabelecimento_serie> listaEstabelecimentoSerie;
	private List<Instrucao_bancaria> listaInstrucaoBancaria;
	private List<Item_nfe> listaItemNFE;
	private List<Justificativa> listaJustificativa;
	private List<Local_entrega_pedido> listaLocalEntregaPedido;
	private List<Mensagem> listaMensagem;
	private List<Natureza_operacao> listaNaturezaOperacao;
	private List<Pedido> listaPedido;
	private List<Produto> listaProduto;
	private List<Vendedor> listaVendedor;
						   	
	public TO() {
	}
	public TO(List<Pda> _listaPda, List<Boleto> _listaBoleto, List<Cliente_pedido> _listaClientePedido, List<Condicao_pagamento> _listaCondicaoPagamento,	
			  List<Embarque> _listaEmbarque, List<Estabelecimento_serie> _listaEstabelecimentoSerie, List<Instrucao_bancaria> _listaInstrucaoBancaria,	
			  List<Item_nfe> _listaItemNFE, List<Justificativa> _listaJustificativa, List<Local_entrega_pedido> _listaLocalEntregaPedido, List<Mensagem> _listaMensagem, 
			  List<Natureza_operacao> _listaNaturezaOperacao, List<Pedido> _listaPedido, List<Produto> _listaProduto, List<Vendedor> _listaVendedor){
		
		this.listaPda = _listaPda;
		this.listaBoleto = _listaBoleto;
		this.listaClientePedido = _listaClientePedido;
		this.listaCondicaoPagamento = _listaCondicaoPagamento;
		this.listaEmbarque = _listaEmbarque;
		this.listaEstabelecimentoSerie = _listaEstabelecimentoSerie;
		this.listaInstrucaoBancaria = _listaInstrucaoBancaria;
		this.listaItemNFE = _listaItemNFE;
		this.listaJustificativa = _listaJustificativa;
		this.listaLocalEntregaPedido = _listaLocalEntregaPedido;
		this.listaMensagem = _listaMensagem;
		this.listaNaturezaOperacao = _listaNaturezaOperacao;
		this.listaPedido = _listaPedido;
		this.listaProduto = _listaProduto;
		this.listaVendedor = _listaVendedor;	
	}
	
	
	public String getNr_pda() {
		return nr_pda;
	}
	public void setNr_pda(String nr_pda) {
		this.nr_pda = nr_pda;
	}
	public int getAchou_nr_pda() {
		return achou_nr_pda;
	}
	public void setAchou_nr_pda(int achou_nr_pda) {
		this.achou_nr_pda = achou_nr_pda;
	}
	
	public List<Pda> getListaPda() {
		return listaPda;
	}
	public void setListaPda(List<Pda> listaPda) {
		this.listaPda = listaPda;
	}
	public List<Boleto> getListaBoleto() {
		return listaBoleto;
	}
	public void setListaBoleto(List<Boleto> listaBoleto) {
		this.listaBoleto = listaBoleto;
	}
	public List<Cliente_pedido> getListaClientePedido() {
		return listaClientePedido;
	}
	public void setListaClientePedido(List<Cliente_pedido> listaClientePedido) {
		this.listaClientePedido = listaClientePedido;
	}
	public List<Condicao_pagamento> getListaCondicaoPagamento() {
		return listaCondicaoPagamento;
	}
	public void setListaCondicaoPagamento(List<Condicao_pagamento> listaCondicaoPagamento) {
		this.listaCondicaoPagamento = listaCondicaoPagamento;
	}
	public List<Embarque> getListaEmbarque() {
		return listaEmbarque;
	}
	public void setListaEmbarque(List<Embarque> listaEmbarque) {
		this.listaEmbarque = listaEmbarque;
	}
	public List<Estabelecimento_serie> getListaEstabelecimentoSerie() {
		return listaEstabelecimentoSerie;
	}
	public void setListaEstabelecimentoSerie(List<Estabelecimento_serie> listaEstabelecimentoSerie) {
		this.listaEstabelecimentoSerie = listaEstabelecimentoSerie;
	}
	public List<Instrucao_bancaria> getListaInstrucaoBancaria() {
		return listaInstrucaoBancaria;
	}
	public void setListaInstrucaoBancaria(List<Instrucao_bancaria> listaInstrucaoBancaria) {
		this.listaInstrucaoBancaria = listaInstrucaoBancaria;
	}
	public List<Item_nfe> getListaItemNFE() {
		return listaItemNFE;
	}
	public void setListaItemNFE(List<Item_nfe> listaItemNFE) {
		this.listaItemNFE = listaItemNFE;
	}
	public List<Justificativa> getListaJustificativa() {
		return listaJustificativa;
	}
	public void setListaJustificativa(List<Justificativa> listaJustificativa) {
		this.listaJustificativa = listaJustificativa;
	}
	public List<Local_entrega_pedido> getListaLocalEntregaPedido() {
		return listaLocalEntregaPedido;
	}
	public void setListaLocalEntregaPedido(List<Local_entrega_pedido> listaLocalEntregaPedido) {
		this.listaLocalEntregaPedido = listaLocalEntregaPedido;
	}
	public List<Mensagem> getListaMensagem() {
		return listaMensagem;
	}
	public void setListaMensagem(List<Mensagem> listaMensagem) {
		this.listaMensagem = listaMensagem;
	}
	public List<Natureza_operacao> getListaNaturezaOperacao() {
		return listaNaturezaOperacao;
	}
	public void setListaNaturezaOperacao(List<Natureza_operacao> listaNaturezaOperacao) {
		this.listaNaturezaOperacao = listaNaturezaOperacao;
	}
	public List<Pedido> getListaPedido() {
		return listaPedido;
	}
	public void setListaPedido(List<Pedido> listaPedido) {
		this.listaPedido = listaPedido;
	}
	public List<Produto> getListaProduto() {
		return listaProduto;
	}
	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}
	public List<Vendedor> getListaVendedor() {
		return listaVendedor;
	}
	public void setListaVendedor(List<Vendedor> listaVendedor) {
		this.listaVendedor = listaVendedor;
	}

}
