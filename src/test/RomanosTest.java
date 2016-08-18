package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import modelo.ConversorRomanos;

public class RomanosTest {
	
	ConversorRomanos conversor;
	
	@Before
	public void inicializa(){
		conversor = new ConversorRomanos();
	}
	
	@Test
	public void deveConverterValoresSimplesComo_O_I() {
		assertEquals(1, conversor.converter("I"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void deveFalharAoEnviarLetra(){
		assertEquals(2, conversor.converter("G"));
	}
	
	@Test
	public void deveConverterQuandoPassarMaisDeUmAlgarismo(){
		assertEquals(4, conversor.converter("IV"));
	}
	
	@Test
	public void deveConverterQuandoPassarMaisDeUmAlgarismoIguais(){
		assertEquals(2, conversor.converter("II"));
	}
	

}
