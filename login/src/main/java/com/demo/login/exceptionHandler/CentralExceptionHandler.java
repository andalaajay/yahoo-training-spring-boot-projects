package com.demo.login.exceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.demo.login.exception.AccountNotFoundException;

@ControllerAdvice
public class CentralExceptionHandler {
	
	@ExceptionHandler(AccountNotFoundException.class)
	public ResponseEntity<String>  method(AccountNotFoundException ex)
	{
		String str=ex.msg;
		return ResponseEntity.badRequest().body(str);
	}

}





