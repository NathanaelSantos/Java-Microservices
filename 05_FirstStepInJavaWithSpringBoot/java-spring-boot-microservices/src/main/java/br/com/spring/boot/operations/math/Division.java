package br.com.spring.boot.operations.math;

import br.com.spring.boot.converters.ConvertToDouble;
import br.com.spring.boot.exceptions.UnsuportedMathOperationException;

public class Division {
	public Double division(String numberOne, String numberTwo) {
		
		ConvertToDouble convertToDouble = new ConvertToDouble();	
		Double valueTwo = convertToDouble.convertToDouble(numberTwo);
		
		if(valueTwo == 0.0) {
			throw new UnsuportedMathOperationException("It is not possible to divide by zero");
		} else {
			return convertToDouble.convertToDouble(numberOne) / convertToDouble.convertToDouble(numberTwo);
		}
	}
}
