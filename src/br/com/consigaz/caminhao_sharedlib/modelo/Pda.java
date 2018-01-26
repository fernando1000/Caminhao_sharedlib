package br.com.consigaz.caminhao_sharedlib.modelo;

import java.io.Serializable;

public class Pda implements Serializable{
	
	private String nr_pda;
	private String nome;
	private int senha;
	private String empresa;
	private String setor;
	private String equipes;
	private String cidade;
	private String estado;
	private int status;
	private String placa_veiculo;
	private int modelo_nota;
	private String densidade;
	private int tipo_venda;
	private int cancelar_nf;
	private String chave_liberacao;
	
	public static final String COLUMN_TEXT_NR_PDA = "nr_pda";
	public static final String COLUMN_TEXT_NOME = "nome";
	public static final String COLUMN_INTEGER_SENHA = "senha";
	public static final String COLUMN_TEXT_EMPRESA = "empresa";
	public static final String COLUMN_TEXT_SETOR = "setor";
	public static final String COLUMN_TEXT_EQUIPES = "equipes";
	public static final String COLUMN_TEXT_CIDADE = "cidade";
	public static final String COLUMN_TEXT_ESTADO = "estado";
	public static final String COLUMN_INTEGER_STATUS = "status";
	public static final String COLUMN_TEXT_PLACA_VEICULO = "placa_veiculo";
	public static final String COLUMN_INTEGER_MODELO_NOTA = "modelo_nota";
	public static final String COLUMN_TEXT_DENSIDADE = "densidade";
	public static final String COLUMN_INTEGER_TIPO_VENDA = "tipo_venda";
	public static final String COLUMN_INTEGER_CANCELAR_NF = "cancelar_nf";
	public static final String COLUMN_TEXT_CHAVE_LIBERACAO = "chave_liberacao";


	
	
	
	public String getNr_pda() {
		return nr_pda;
	}
	public void setNr_pda(String nr_pda) {
		this.nr_pda = nr_pda;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getEquipes() {
		return equipes;
	}
	public void setEquipes(String equipes) {
		this.equipes = equipes;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getPlaca_veiculo() {
		return placa_veiculo;
	}
	public void setPlaca_veiculo(String placa_veiculo) {
		this.placa_veiculo = placa_veiculo;
	}
	public int getModelo_nota() {
		return modelo_nota;
	}
	public void setModelo_nota(int modelo_nota) {
		this.modelo_nota = modelo_nota;
	}
	public String getDensidade() {
		return densidade;
	}
	public void setDensidade(String densidade) {
		this.densidade = densidade;
	}
	public int getTipo_venda() {
		return tipo_venda;
	}
	public void setTipo_venda(int tipo_venda) {
		this.tipo_venda = tipo_venda;
	}
	public int getCancelar_nf() {
		return cancelar_nf;
	}
	public void setCancelar_nf(int cancelar_nf) {
		this.cancelar_nf = cancelar_nf;
	}
	public String getChave_liberacao() {
		return chave_liberacao;
	}
	public void setChave_liberacao(String chave_liberacao) {
		this.chave_liberacao = chave_liberacao;
	}
}
