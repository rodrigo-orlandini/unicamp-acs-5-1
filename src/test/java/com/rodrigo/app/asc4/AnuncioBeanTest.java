package com.rodrigo.app.asc4;

import static org.junit.jupiter.api.Assertions.*;
import java.net.URL;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AnuncioBeanTest {
	private ProdutoBean produto = new ProdutoBean(
		"ABC001",
		"Teste",
		"Produto para teste",
		20.0,
		"Disponível"
	);
	
	private ArrayList<URL> fotosURL = new ArrayList();
	
	private AnuncioBean anuncio = new AnuncioBean(
		produto,
		fotosURL,
		0.5
	);
	
	@Test
	void testGetValor() {
		Double updatedPrice = anuncio.getValor();
		assertEquals(updatedPrice, 10.0);
		assertThrows(
			IllegalArgumentException.class,
			() -> new AnuncioBean(
				this.produto,
				this.fotosURL,
				2.0
			)
		);
			
		assertThrows(
		IllegalArgumentException.class,
			() -> new AnuncioBean(
				this.produto,
				this.fotosURL,
				-1.0
			)
		);
	}
}
