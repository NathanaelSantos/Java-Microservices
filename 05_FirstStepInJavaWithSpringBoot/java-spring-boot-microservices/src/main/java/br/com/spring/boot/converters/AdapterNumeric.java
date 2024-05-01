package br.com.spring.boot.converters;

public class AdapterNumeric {
	public boolean isNumeric(String numberOne) {
		if(numberOne == null) {
			return false;
		}
		
		String number = numberOne.replaceAll(",", ".");
		
		return number.matches("[_+]?[0-9]*\\.?[0-9]+");
	}
}
