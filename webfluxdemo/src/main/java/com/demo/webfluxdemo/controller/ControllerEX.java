package com.demo.webfluxdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.webfluxdemo.service.ServiceEx;



@RestController
public class ControllerEX {
	
	@Autowired
	private ServiceEx service;
	
	@GetMapping("/getAll/{id}")
	public int multiply(@PathVariable int id)
	{
		return service.multiply(id);
	}
	@GetMapping("table/{input}")
	public List<Integer> table(@PathVariable int input)
	{
		//Flux<Integer> result=service.table(input);
		return service.table(input);
	}
	
}
