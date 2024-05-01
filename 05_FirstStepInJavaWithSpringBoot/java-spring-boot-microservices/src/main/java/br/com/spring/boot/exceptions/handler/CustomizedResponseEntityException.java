package br.com.spring.boot.exceptions.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.spring.boot.exceptions.ExceptionResponse;
import br.com.spring.boot.exceptions.UnsuportedMathOperationException;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityException extends ResponseEntityExceptionHandler{

	@ExceptionHandler(UnsuportedMathOperationException.class)
	public final ResponseEntity<ExceptionResponse> handleBadRequestExceptions(Exception exception, WebRequest request) {
		ExceptionResponse exceptionResptonse = new ExceptionResponse(new Date(), exception.getMessage(), request.getDescription(false));
		
		return new ResponseEntity<>(exceptionResptonse, HttpStatus.BAD_REQUEST);
	}
}
