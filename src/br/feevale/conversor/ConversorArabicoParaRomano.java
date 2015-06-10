package br.feevale.conversor;

public class ConversorArabicoParaRomano {

	public String converte(String arabico) {
		if (arabico.length() == 1) {
			return converteUltimaCasa(arabico.charAt(0));
		} else if (arabico.length() == 2) {
			return converteSegundaCasa(arabico.charAt(0)) + converteUltimaCasa(arabico.charAt(1));
		} else if (arabico.length() == 3) {
			return converteTerceiraCasa(arabico.charAt(0)) + converteSegundaCasa(arabico.charAt(1)) + converteUltimaCasa(arabico.charAt(2));
		}
		
		return null;
	}

	protected String converteUltimaCasa(char digito) {
		switch (digito) {
		case '1': return "I";
		case '2': return "II";
		case '3': return "III";
		case '4': return "IV";
		case '5': return "V";
		case '6': return "VI";
		case '7': return "VII";
		case '8': return "VIII";
		case '9': return "IX";
		default: return "";
		}
	}
	
	private String converteSegundaCasa(char digito) {
		switch (digito) {
		case '1': return "X";
		case '2': return "XX";
		case '3': return "XXX";
		case '4': return "XL";
		case '5': return "L";
		case '6': return "LX";
		case '7': return "LXX";
		case '8': return "LXXX";
		case '9': return "XC";
		default: return "";
		}
	}
	
	private String converteTerceiraCasa(char digito) {
		switch (digito) {
		case '1': return "C";
		case '2': return "CC";
		case '3': return "CCC";
		case '4': return "CD";
		case '5': return "D";
		case '6': return "DC";
		case '7': return "DCC";
		case '8': return "DCCC";
		case '9': return "DM";
		default: return "";
		}
	}
	
}
