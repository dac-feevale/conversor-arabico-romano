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
	
}
