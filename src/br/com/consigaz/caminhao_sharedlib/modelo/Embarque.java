package br.com.consigaz.caminhao_sharedlib.modelo;

public class Embarque {
	
	private int nr_embarque;
	private String cod_estabel;
	private String nome_motorista;
	private String nome_ajudante;
	private int cod_justific_pad_rom;
	private String nome_emit_transp;
	private String endereco_transp;
	private String bairro_transp;
	private String cidade_transp;
	private String estado_transp;
	private String uf_placa_transp;
	private String cgc_transp;
	private String ins_estadual_transp;
	private String cod_veiculo;
	private String dt_embarque;
	private String nr_pda;
	private int nr_registro_motorista;
	private int nr_registro_ajudante;
	private int cod_emitente;
	private String serie_remessa;
	private String nr_nota_fis_remessa;
	private String chave_acesso_nfe;
	private String razao_social_transp;
	private String estado_placa;
	
	public static final String COLUMN_INTEGER_NR_EMBARQUE = "nr_embarque";
	public static final String COLUMN_TEXT_COD_ESTABEL = "cod_estabel";
	public static final String COLUMN_TEXT_NOME_MOTORISTA = "nome_motorista";
	public static final String COLUMN_TEXT_NOME_AJUDANTE = "nome_ajudante";
	public static final String COLUMN_INTEGER_COD_JUSTIFIC_PAD_ROM = "cod_justific_pad_rom";
	public static final String COLUMN_TEXT_NOME_EMIT_TRANSP = "nome_emit_transp";
	public static final String COLUMN_TEXT_ENDERECO_TRANSP = "endereco_transp";
	public static final String COLUMN_TEXT_BAIRRO_TRANSP = "bairro_transp";
	public static final String COLUMN_TEXT_CIDADE_TRANSP = "cidade_transp";
	public static final String COLUMN_TEXT_ESTADO_TRANSP = "estado_transp";
	public static final String COLUMN_TEXT_UF_PLACA_TRANSP = "uf_placa_transp";
	public static final String COLUMN_TEXT_CGC_TRANSP = "cgc_transp";
	public static final String COLUMN_TEXT_INS_ESTADUAL_TRANSP = "ins_estadual_transp";
	public static final String COLUMN_TEXT_COD_VEICULO = "cod_veiculo";
	public static final String COLUMN_TEXT_DT_EMBARQUE = "dt_embarque";
	public static final String COLUMN_TEXT_NR_PDA = "nr_pda";
	public static final String COLUMN_INTEGER_NR_REGISTRO_MOTORISTA = "nr_registro_motorista";
	public static final String COLUMN_INTEGER_NR_REGISTRO_AJUDANTE = "nr_registro_ajudante";
	public static final String COLUMN_INTEGER_COD_EMITENTE = "cod_emitente";
	public static final String COLUMN_TEXT_SERIE_REMESSA = "serie_remessa";
	public static final String COLUMN_TEXT_NR_NOTA_FIS_REMESSA = "nr_nota_fis_remessa";
	public static final String COLUMN_TEXT_CHAVE_ACESSO_NFE = "chave_acesso_nfe";
	public static final String COLUMN_TEXT_RAZAO_SOCIAL_TRANSP = "razao_social_transp";
	public static final String COLUMN_TEXT_ESTADO_PLACA = "estado_placa";


	
	public int getNr_embarque() {
		return nr_embarque;
	}
	public void setNr_embarque(int nr_embarque) {
		this.nr_embarque = nr_embarque;
	}
	public String getCod_estabel() {
		return cod_estabel;
	}
	public void setCod_estabel(String cod_estabel) {
		this.cod_estabel = cod_estabel;
	}
	public String getNome_motorista() {
		return nome_motorista;
	}
	public void setNome_motorista(String nome_motorista) {
		this.nome_motorista = nome_motorista;
	}
	public String getNome_ajudante() {
		return nome_ajudante;
	}
	public void setNome_ajudante(String nome_ajudante) {
		this.nome_ajudante = nome_ajudante;
	}
	public int getCod_justific_pad_rom() {
		return cod_justific_pad_rom;
	}
	public void setCod_justific_pad_rom(int cod_justific_pad_rom) {
		this.cod_justific_pad_rom = cod_justific_pad_rom;
	}
	public String getNome_emit_transp() {
		return nome_emit_transp;
	}
	public void setNome_emit_transp(String nome_emit_transp) {
		this.nome_emit_transp = nome_emit_transp;
	}
	public String getEndereco_transp() {
		return endereco_transp;
	}
	public void setEndereco_transp(String endereco_transp) {
		this.endereco_transp = endereco_transp;
	}
	public String getBairro_transp() {
		return bairro_transp;
	}
	public void setBairro_transp(String bairro_transp) {
		this.bairro_transp = bairro_transp;
	}
	public String getCidade_transp() {
		return cidade_transp;
	}
	public void setCidade_transp(String cidade_transp) {
		this.cidade_transp = cidade_transp;
	}
	public String getEstado_transp() {
		return estado_transp;
	}
	public void setEstado_transp(String estado_transp) {
		this.estado_transp = estado_transp;
	}
	public String getUf_placa_transp() {
		return uf_placa_transp;
	}
	public void setUf_placa_transp(String uf_placa_transp) {
		this.uf_placa_transp = uf_placa_transp;
	}
	public String getCgc_transp() {
		return cgc_transp;
	}
	public void setCgc_transp(String cgc_transp) {
		this.cgc_transp = cgc_transp;
	}
	public String getIns_estadual_transp() {
		return ins_estadual_transp;
	}
	public void setIns_estadual_transp(String ins_estadual_transp) {
		this.ins_estadual_transp = ins_estadual_transp;
	}
	public String getCod_veiculo() {
		return cod_veiculo;
	}
	public void setCod_veiculo(String cod_veiculo) {
		this.cod_veiculo = cod_veiculo;
	}
	public String getDt_embarque() {
		return dt_embarque;
	}
	public void setDt_embarque(String dt_embarque) {
		this.dt_embarque = dt_embarque;
	}
	public String getNr_pda() {
		return nr_pda;
	}
	public void setNr_pda(String nr_pda) {
		this.nr_pda = nr_pda;
	}
	public int getNr_registro_motorista() {
		return nr_registro_motorista;
	}
	public void setNr_registro_motorista(int nr_registro_motorista) {
		this.nr_registro_motorista = nr_registro_motorista;
	}
	public int getNr_registro_ajudante() {
		return nr_registro_ajudante;
	}
	public void setNr_registro_ajudante(int nr_registro_ajudante) {
		this.nr_registro_ajudante = nr_registro_ajudante;
	}
	public int getCod_emitente() {
		return cod_emitente;
	}
	public void setCod_emitente(int cod_emitente) {
		this.cod_emitente = cod_emitente;
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
	public String getChave_acesso_nfe() {
		return chave_acesso_nfe;
	}
	public void setChave_acesso_nfe(String chave_acesso_nfe) {
		this.chave_acesso_nfe = chave_acesso_nfe;
	}
	public String getRazao_social_transp() {
		return razao_social_transp;
	}
	public void setRazao_social_transp(String razao_social_transp) {
		this.razao_social_transp = razao_social_transp;
	}
	public String getEstado_placa() {
		return estado_placa;
	}
	public void setEstado_placa(String estado_placa) {
		this.estado_placa = estado_placa;
	}

}
