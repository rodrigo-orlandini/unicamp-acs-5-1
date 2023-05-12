package com.rodrigo.app.asc4;

import java.util.ArrayList;

public class AnuncianteBean {
	// Nome do anunciante
	private String nome;
	
	// CFP do anuncioante
	private String cpf;
	
	// Lista de anuncios de um anunciante
	private ArrayList<AnuncioBean> anuncios;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public ArrayList<AnuncioBean> getAnuncios() {
		return this.anuncios;
	}
	
	public void setAnuncios(ArrayList<AnuncioBean> anuncios) {
		this.anuncios = anuncios;
	}
	
	// Construtor deafult
	public AnuncianteBean() {
		this.nome = new String();
		this.cpf = new String();
		this.anuncios = new ArrayList<AnuncioBean>();
	}
	
	// Construtor com parametros
	public AnuncianteBean(
		String nome,
		String cPF,
		ArrayList<AnuncioBean> anuncios
	) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.anuncios = anuncios;
	}
	
	// Inclui novo anuncio na lista de anuncios de um anunciante
	public void addAnuncio (AnuncioBean newAnuncio) {
		this.anuncios.add(newAnuncio);
	}
	
	// Remove anuncio da lista de anuncios de um anunciante
	public void removeAnuncio (int index) {
		this.anuncios.remove(index);
	}
	
	// Calcula o valor medio de anuncios de um anuciante
	public Double valorMedioAnuncios() {
		Double soma = 0.0;
		
		for (AnuncioBean anuncio: anuncios) {
			soma += anuncio.getValor();
		}
		
		return soma / this.anuncios.size();
	}
}
