package br.com.spring.boot.operations.math;

import br.com.spring.boot.converters.ConvertToDouble;

public class SquareRoot {
	public Double squareRoot(String number) {
		ConvertToDouble convertToDouble = new ConvertToDouble();
		return Math.sqrt(convertToDouble.convertToDouble(number));
	}
}
