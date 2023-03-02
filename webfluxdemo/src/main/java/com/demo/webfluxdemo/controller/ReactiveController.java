package com.demo.webfluxdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.webfluxdemo.dto.Multiply;
import com.demo.webfluxdemo.service.ReactiveService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
//class is in completely reactive form
@RestController
@RequestMapping("/reactive")
public class ReactiveController {
	@Autowired
	private ReactiveService service;
	@GetMapping("/getAll/{id}")
	public Mono<Integer> multiply(@PathVariable int id)
	{
		//Mono<Integer> result=service.multiply(id);
		return service.square(id);
	}
	@GetMapping("table/{input}")
	public Flux<Integer> table(@PathVariable int input)
	{
		//Flux<Integer> result=service.table(input);
		return service.table(input);
	}
	//when we use the  produces of mediatype then we can pass the result one by one
	//and also when user cancel the request at the middle then also the processing will be stopped at middle
	@GetMapping(value="table/{input}/check",produces=MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Integer> table2(@PathVariable int input)
	{
		//Flux<Integer> result=service.table(input);
		return service.table(input);
	}
	
	@PostMapping("/multiply")
	public Mono<Integer> multiply(@RequestBody Mono<Multiply> input)
	{
		return service.multiplyTwo(input); 
	}

}
