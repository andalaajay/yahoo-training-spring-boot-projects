package com.demo.webfluxdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.webfluxdemo.exception.InputInvalidException;
import com.demo.webfluxdemo.service.ReactiveService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/exception")
public class ValidationController {
	
	@Autowired
	private ReactiveService service;
	
	@GetMapping("table/{input}")
	public Flux<Integer> table(@PathVariable int input)
	{
		//Flux<Integer> result=service.table(input);
		if(input>10 && input<20)
			return service.table(input);
	   throw new InputInvalidException(input);
	}

}
