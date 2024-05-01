package br.com.spring.boot.converters;

public class ConvertToDouble {
	
	public Double convertToDouble(String numberOne) {
		if(numberOne == null) {
			return 0D;
		}
		
		String number = numberOne.replaceAll(",", ".");
		AdapterNumeric adapterNumeric = new AdapterNumeric();

		if(adapterNumeric.isNumeric(number)) {
			return Double.parseDouble(number);
		}
		return 0D;
	}
}
