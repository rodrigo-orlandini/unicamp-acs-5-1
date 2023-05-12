package com.rodrigo.app.asc4;

import java.net.URL;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AnuncianteBeanTest {
	private AnuncianteBean anunciante = new AnuncianteBean();
	
	@Test
	void testAddAnuncio() {
		AnuncioBean anuncio = new AnuncioBean();
		
		this.anunciante.addAnuncio(anuncio);
		this.anunciante.addAnuncio(anuncio);
		this.anunciante.addAnuncio(anuncio);
		
		ArrayList<AnuncioBean> anuncios = anunciante.getAnuncios();
		
		assertEquals(anuncios.size(), 3);
	}
	
	@Test
	void testRemoveAnuncio() {
		AnuncioBean anuncio = new AnuncioBean();
		
		this.anunciante.addAnuncio(anuncio);
		this.anunciante.addAnuncio(anuncio);
		this.anunciante.removeAnuncio(1);
		
		ArrayList<AnuncioBean> anuncios = anunciante.getAnuncios();
		
		assertEquals(anuncios.size(), 1);
	}
	
	@Test
	void testValorMedioAnuncios() {
		ProdutoBean produto = new ProdutoBean(
			"ABC001",
			"Teste",
			"Produto para teste",
			20.0,
			"Disponível"
		);
		
		ArrayList<URL> fotosURL = new ArrayList();
		
		AnuncioBean anuncio1 = new AnuncioBean(
			produto,
			fotosURL,
			0.5
		);
		
		AnuncioBean anuncio2 = new AnuncioBean(
			produto,
			fotosURL,
			0.3
		);
		
		anunciante.addAnuncio(anuncio1);
		anunciante.addAnuncio(anuncio2);
		
		Double mediaAnuncios = anunciante.valorMedioAnuncios();
		
		assertEquals(mediaAnuncios, 12);
	}
}
