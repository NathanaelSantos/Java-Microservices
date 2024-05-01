package br.com.spring.boot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationException extends RuntimeException{

	public UnsuportedMathOperationException(String exception) {
		super(exception);
	}

	private static final long serialVersionUID = 1L;
	
	

}
