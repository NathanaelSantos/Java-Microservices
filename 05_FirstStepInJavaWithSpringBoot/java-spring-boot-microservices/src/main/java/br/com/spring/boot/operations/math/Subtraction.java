package br.com.spring.boot.operations.math;

import br.com.spring.boot.converters.ConvertToDouble;

public class Subtraction {
	public Double subtraction(String numberOne, String numberTwo) {
		ConvertToDouble convertToDouble = new ConvertToDouble();
		Double totalSubtraction = convertToDouble.convertToDouble(numberOne) - convertToDouble.convertToDouble(numberTwo);	
		
		return totalSubtraction;
	}
}
