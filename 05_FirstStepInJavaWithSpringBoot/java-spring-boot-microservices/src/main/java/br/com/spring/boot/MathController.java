package br.com.spring.boot;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.boot.converters.AdapterNumeric;
import br.com.spring.boot.exceptions.UnsuportedMathOperationException;
import br.com.spring.boot.operations.math.Addition;
import br.com.spring.boot.operations.math.Division;
import br.com.spring.boot.operations.math.Mean;
import br.com.spring.boot.operations.math.Multiplication;
import br.com.spring.boot.operations.math.SquareRoot;
import br.com.spring.boot.operations.math.Subtraction;

@RestController
public class MathController {
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		AdapterNumeric adapterNumeric = new AdapterNumeric();
		if(!adapterNumeric.isNumeric(numberOne) || !adapterNumeric.isNumeric(numberTwo) ) { 
			throw new UnsuportedMathOperationException("Please, set a numeric value");
		}
		
		Addition addition = new Addition();
		return addition.sum(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
		
		AdapterNumeric adapterNumeric = new AdapterNumeric();
		if(!adapterNumeric.isNumeric(numberOne) || !adapterNumeric.isNumeric(numberTwo) ) { 
			throw new UnsuportedMathOperationException("Please, set a numeric value");
		}
		
		Subtraction subtration = new Subtraction();
		return subtration.subtraction(numberOne, numberTwo);
	
	}
	
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo ) {
		
		AdapterNumeric adapterNumeric = new AdapterNumeric();
		if(!adapterNumeric.isNumeric(numberOne) || !adapterNumeric.isNumeric(numberTwo) ) { 
			throw new UnsuportedMathOperationException("Please, set a numeric value");
		}
		
		Division division = new Division();
		return division.division(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mult(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
		
		AdapterNumeric adapterNumeric = new AdapterNumeric();
		if(!adapterNumeric.isNumeric(numberOne) || !adapterNumeric.isNumeric(numberTwo) ) { 
			throw new UnsuportedMathOperationException("Please, set a numeric value");
		}
		
		Multiplication multiplication = new Multiplication();
		return multiplication.multiplication(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mean(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
		
		AdapterNumeric adapterNumeric = new AdapterNumeric();
		if(!adapterNumeric.isNumeric(numberOne) || !adapterNumeric.isNumeric(numberTwo) ) { 
			throw new UnsuportedMathOperationException("Please, set a numeric value");
		}
		
		Mean mean = new Mean();
		return mean.mean(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable(value = "number") String number) {
		
		AdapterNumeric adapterNumeric = new AdapterNumeric();
		if(!adapterNumeric.isNumeric(number)) { 
			throw new UnsuportedMathOperationException("Please, set a numeric value");
		}
		
		SquareRoot squareRoot = new SquareRoot();
		return squareRoot.squareRoot(number);
	}
}
