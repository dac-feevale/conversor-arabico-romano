package br.feevale.conversor;

import org.junit.Assert;
import org.junit.Test;

public class ConversorArabicoParaRomanoTest {

	@Test
	public void converteNumero1ParaITest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("1");
		
		Assert.assertEquals("I", resultado);
	}
	
	@Test
	public void converteNumero4ParaIVTest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("4");
		
		Assert.assertEquals("IV", resultado);
	}
	
	@Test
	public void converteNumero5ParaVTest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("5");
		
		Assert.assertEquals("V", resultado);
	}
	
	@Test
	public void converteNumero9ParaIXTest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("9");
		
		Assert.assertEquals("IX", resultado);
	}
	
	@Test
	public void converteNumero10ParaXTest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("10");
		
		Assert.assertEquals("X", resultado);
	}
	
	@Test
	public void converteNumero11ParaXITest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("11");
		
		Assert.assertEquals("XI", resultado);
	}
	
	@Test
	public void converteNumero14ParaXIVTest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("14");
		
		Assert.assertEquals("XIV", resultado);
	}
	
	@Test
	public void converteNumero15ParaXVTest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("15");
		
		Assert.assertEquals("XV", resultado);
	}
	
	@Test
	public void converteNumero19ParaXIXTest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("19");
		
		Assert.assertEquals("XIX", resultado);
	}
	
	@Test
	public void converteNumero20ParaXXTest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("20");
		
		Assert.assertEquals("XX", resultado);
	}
	
	@Test
	public void converteNumero40ParaXLTest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("40");
		
		Assert.assertEquals("XL", resultado);
	}
	
	@Test
	public void converteNumero44ParaXLIVTest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("44");
		
		Assert.assertEquals("XLIV", resultado);
	}
	
	@Test
	public void converteNumero50ParaLTest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("50");
		
		Assert.assertEquals("L", resultado);
	}
	
	@Test
	public void converteNumero60ParaLXTest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("60");
		
		Assert.assertEquals("LX", resultado);
	}
	
	@Test
	public void converteNumero90ParaXCTest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("90");
		
		Assert.assertEquals("XC", resultado);
	}
	
	@Test
	public void converteNumero100ParaXTest() {
		ConversorArabicoParaRomano conversor = new ConversorArabicoParaRomano();
		String resultado = conversor.converte("100");
		
		Assert.assertEquals("C", resultado);
	}
	
}
