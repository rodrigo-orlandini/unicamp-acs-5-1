package com.rodrigo.app.asc4;

import java.net.URL;
import java.util.ArrayList;

public class AnuncioBean implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// Poduto anuncioado
	private ProdutoBean produto;
	
	// Lista de Fotos do anuncio
	private ArrayList<URL> fotosUrl;
	
	// Fração de desconto sendo 0 (0%) e 1 (100%)
	private Double desconto;
	
	public ProdutoBean getProduto() {
		return this.produto;
	}
	
	public void setProduto(ProdutoBean produto) {
		this.produto = produto;
	}
	
	public ArrayList<URL> getFotosUrl() {
		return this.fotosUrl;
	}
	
	public void setFotosUrl(ArrayList<URL> fotosUrl) {
		this.fotosUrl = fotosUrl;
	}
	
	public Double getDesconto() {
		return this.desconto;
	}
	
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	// Construtor default
	public AnuncioBean () {
		this.produto = new ProdutoBean();
		this.fotosUrl = new ArrayList<URL>();
		this.desconto = 0.0;
	}
	
	// Construtor com parâmetros
	public AnuncioBean(ProdutoBean produto, ArrayList<URL> fotosUrl, Double
	desconto) {
		super();
		this.produto = produto;
		this.fotosUrl = fotosUrl;
		if(desconto > 1.0 || desconto < 0.0) {
			throw new IllegalArgumentException("Desconto Inválido");
		}
		this.desconto = desconto;
	}
	
	// Calcula o valor do anúncio com desconto
	public Double getValor() {
		return this.produto.getValor() - (this.produto.getValor() * this.desconto);
	}
}
