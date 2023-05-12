package com.rodrigo.app.asc4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProdutoBeanTest {
	
	private ProdutoBean produto1 = new ProdutoBean(
		"ABC001",
		"Teste",
		"Produto para teste",
		20.0,
		"Disponível"
	);
	
	private ProdutoBean produto2 = new ProdutoBean(
		"ABC002",
		"Teste",
		"Produto para teste",
		10.0,
		"Disponível"
	);
	
	@Test
	void testCompareTo() {
		int oneGreaterThanTwo = produto1.compareTo(produto2);
		assertEquals(oneGreaterThanTwo, 1);
		
		int twoLessThanOne = produto2.compareTo(produto1);
		assertEquals(twoLessThanOne, -1);
		
		produto2.setValor(20.0);
		int oneEqualsTwo = produto1.compareTo(produto2);
		assertEquals(oneEqualsTwo, 0);
	}
}