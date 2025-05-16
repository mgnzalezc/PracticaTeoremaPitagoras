package tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Clases.TrianguloRectangulo;

class testTrianguloRectangulo {
	
	static TrianguloRectangulo t1;
	static TrianguloRectangulo t2;
	
	@BeforeAll
	static void setUp() {
		t1 = new TrianguloRectangulo() {};
		t2 = new TrianguloRectangulo(5,2) {};
	}

	@Test
	void testAreaDefecto() {
		assertEquals(0,t1.area());
	}
	
	@Test
	void testAreaRandom() {
		assertEquals(5,t2.area());
	}

	@Test
	void testHipotenusaDefecto() {
		assertEquals(1.4142,t1.hipotenusa()); //tengo que poner todos los decimales??
	}
	
	@Test
	void testHipotenusaRandom() {
		assertEquals(5.3851,t2.hipotenusa()); //tengo que poner todos los decimales??
	}
	
	@Test
	void testPerimetroDefecto() {
		assertEquals(3.41421,t1.perimetro());
	}
	
	@Test
	void testPerimetroRandom() {
		assertEquals(12.3851,t2.perimetro());
	}

	@Test
	void testException() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {new TrianguloRectangulo(-1,-1);} );
		String mensajeEsperado = "Numero menor o igual a 0";
		String mensajeObtenido = e.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}
}
