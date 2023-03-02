package com.demo.webfluxdemo.service;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

@Service
public class ServiceEx {
	
	//traditional method 
	public List<Integer> table(int input)
	{
		return IntStream.range(1,10)
				.mapToObj(i->i*input)
				.collect(Collectors.toList());
		
	}

	public int multiply(int id) { 
		return id*id;
	}
	
}