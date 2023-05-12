package com.rodrigo.app.asc4;

public class ProdutoBean implements java.io.Serializable, Comparable<ProdutoBean> {
	
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private String nome;
	private String descricao;
	private Double valor;
	private String estado;
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getValor() {
		return this.valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public ProdutoBean () {
		this.codigo = new String();
		this.nome = new String();
		this.descricao = new String();
		this.valor = 0.0;
		this.estado = new String();
	}
	
	public ProdutoBean(
		String codigo,
		String nome,
		String descricao,
		Double valor,
		String estado
	) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.estado = estado;
	}
	
	@Override
	public int compareTo(ProdutoBean produto) {
		if (this.valor > produto.getValor()) {
			return 1;
		} else if (this.valor > produto.getValor()) {
			return -1;
		} else {
			return 0;
		}
	}
}
