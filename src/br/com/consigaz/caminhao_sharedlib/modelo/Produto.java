package br.com.consigaz.caminhao_sharedlib.modelo;

import java.io.Serializable;

public class Produto implements Serializable{

	private String it_codigo;
	private String desc_item;
	private String narrativa;
	private String class_fiscal;
	private double aliquota_ipi;
	private int cd_trib_icm;
	private int cd_trib_ipi;
	private String uni;
	private double peso_liquido;
	private double peso_bruto;
	
	public static final String COLUMN_TEXT_IT_CODIGO = "it_codigo";
	public static final String COLUMN_TEXT_DESC_ITEM = "desc_item";
	public static final String COLUMN_TEXT_NARRATIVA = "narrativa";
	public static final String COLUMN_TEXT_CLASS_FISCAL = "class_fiscal";
	public static final String COLUMN_TEXT_ALIQUOTA_IPI = "aliquota_ipi";
	public static final String COLUMN_INTEGER_CD_TRIB_ICM = "cd_trib_icm";
	public static final String COLUMN_INTEGER_CD_TRIB_IPI = "cd_trib_ipi";
	public static final String COLUMN_TEXT_UNI = "uni";
	public static final String COLUMN_TEXT_PESO_LIQUIDO = "peso_liquido";
	public static final String COLUMN_TEXT_PESO_BRUTO = "peso_bruto";


	
	public String getIt_codigo() {
		return it_codigo;
	}
	public void setIt_codigo(String it_codigo) {
		this.it_codigo = it_codigo;
	}
	public String getDesc_item() {
		return desc_item;
	}
	public void setDesc_item(String desc_item) {
		this.desc_item = desc_item;
	}
	public String getNarrativa() {
		return narrativa;
	}
	public void setNarrativa(String narrativa) {
		this.narrativa = narrativa;
	}
	public String getClass_fiscal() {
		return class_fiscal;
	}
	public void setClass_fiscal(String class_fiscal) {
		this.class_fiscal = class_fiscal;
	}
	public double getAliquota_ipi() {
		return aliquota_ipi;
	}
	public void setAliquota_ipi(double aliquota_ipi) {
		this.aliquota_ipi = aliquota_ipi;
	}
	public int getCd_trib_icm() {
		return cd_trib_icm;
	}
	public void setCd_trib_icm(int cd_trib_icm) {
		this.cd_trib_icm = cd_trib_icm;
	}
	public int getCd_trib_ipi() {
		return cd_trib_ipi;
	}
	public void setCd_trib_ipi(int cd_trib_ipi) {
		this.cd_trib_ipi = cd_trib_ipi;
	}
	public String getUni() {
		return uni;
	}
	public void setUni(String uni) {
		this.uni = uni;
	}
	public double getPeso_liquido() {
		return peso_liquido;
	}
	public void setPeso_liquido(double peso_liquido) {
		this.peso_liquido = peso_liquido;
	}
	public double getPeso_bruto() {
		return peso_bruto;
	}
	public void setPeso_bruto(double peso_bruto) {
		this.peso_bruto = peso_bruto;
	}
}
