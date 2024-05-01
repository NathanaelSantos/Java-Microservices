package br.com.spring.boot.operations.math;

import br.com.spring.boot.converters.ConvertToDouble;

public class Mean {
	public Double mean(String numberOne, String numberTwo) {
		ConvertToDouble convertToDouble = new ConvertToDouble();
		return (convertToDouble.convertToDouble(numberOne) + convertToDouble.convertToDouble(numberTwo))/2;
	}
}
