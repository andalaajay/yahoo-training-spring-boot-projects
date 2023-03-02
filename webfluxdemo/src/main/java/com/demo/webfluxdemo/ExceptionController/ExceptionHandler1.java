package com.demo.webfluxdemo.ExceptionController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.demo.webfluxdemo.dto.InvalidResponse;
import com.demo.webfluxdemo.exception.InputInvalidException;

@ControllerAdvice
public class ExceptionHandler1 {
	
	@ExceptionHandler(InputInvalidException.class)
	public ResponseEntity<InvalidResponse>  method(InputInvalidException ex)
	{
		InvalidResponse response=new InvalidResponse();
		response.setInput(ex.getInput());
		response.setMessage(ex.getMessage());
		return ResponseEntity.badRequest().body(response);
	}
}
