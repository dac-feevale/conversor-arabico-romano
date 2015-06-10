package br.feevale.conversor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConversorArabicoParaRomanoTest {

	private ConversorArabicoParaRomano conversor;
	
	@Before
	public void setup() {
		conversor = new ConversorArabicoParaRomano();
	}
	
	@Test
	public void converteNumero1ParaITest() {
		String resultado = conversor.converte("1");
		
		Assert.assertEquals("I", resultado);
	}
	
	@Test
	public void converteNumero4ParaIVTest() {
		String resultado = conversor.converte("4");
		
		Assert.assertEquals("IV", resultado);
	}
	
	@Test
	public void converteNumero5ParaVTest() {
		String resultado = conversor.converte("5");
		
		Assert.assertEquals("V", resultado);
	}
	
	@Test
	public void converteNumero9ParaIXTest() {
		String resultado = conversor.converte("9");
		
		Assert.assertEquals("IX", resultado);
	}
	
	@Test
	public void converteNumero10ParaXTest() {
		String resultado = conversor.converte("10");
		
		Assert.assertEquals("X", resultado);
	}
	
	@Test
	public void converteNumero11ParaXITest() {
		String resultado = conversor.converte("11");
		
		Assert.assertEquals("XI", resultado);
	}
	
	@Test
	public void converteNumero14ParaXIVTest() {
		String resultado = conversor.converte("14");
		
		Assert.assertEquals("XIV", resultado);
	}
	
	@Test
	public void converteNumero15ParaXVTest() {
		String resultado = conversor.converte("15");
		
		Assert.assertEquals("XV", resultado);
	}
	
	@Test
	public void converteNumero19ParaXIXTest() {
		String resultado = conversor.converte("19");
		
		Assert.assertEquals("XIX", resultado);
	}
	
	@Test
	public void converteNumero20ParaXXTest() {
		String resultado = conversor.converte("20");
		
		Assert.assertEquals("XX", resultado);
	}
	
	@Test
	public void converteNumero40ParaXLTest() {
		String resultado = conversor.converte("40");
		
		Assert.assertEquals("XL", resultado);
	}
	
	@Test
	public void converteNumero44ParaXLIVTest() {
		String resultado = conversor.converte("44");
		
		Assert.assertEquals("XLIV", resultado);
	}
	
	@Test
	public void converteNumero50ParaLTest() {
		String resultado = conversor.converte("50");
		
		Assert.assertEquals("L", resultado);
	}
	
	@Test
	public void converteNumero60ParaLXTest() {
		String resultado = conversor.converte("60");
		
		Assert.assertEquals("LX", resultado);
	}
	
	@Test
	public void converteNumero90ParaXCTest() {
		String resultado = conversor.converte("90");
		
		Assert.assertEquals("XC", resultado);
	}
	
	@Test
	public void converteNumero100ParaXTest() {
		String resultado = conversor.converte("100");
		
		Assert.assertEquals("C", resultado);
	}
	
}
