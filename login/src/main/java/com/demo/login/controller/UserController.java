package com.demo.login.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.login.Entity.Customer;
import com.demo.login.service.CustService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@EnableCaching
public class UserController {
	
	
	@Autowired
	private CustService service;
	
	
	@GetMapping("/getAll")
	public Flux<Customer> getAll()
	{
		return service.getAll();
	}
	
	
	@GetMapping("getById/{id}")
	@Cacheable(value="customerCache",key="#id",condition="#id<3")
	//here id values less than 2 only store in the database
	public Mono<Customer> getByID(@PathVariable int id)
	{
		return service.getById(id);
	}
	
	@PostMapping("/register")
	public Mono<Customer> save(@RequestBody Mono<Customer> customer)
	{
		return service.save(customer);
	}
	
	@GetMapping("/loginViaPath/{id}/{password}")
	public Mono<String> loginViaPath(@PathVariable int id,@PathVariable String password) throws InterruptedException, ExecutionException
	{
		return service.loginAuth(id,password);
	}
	
	@DeleteMapping("/deleteById/{id}")
	@CacheEvict(value="customerCache",key="#id")
	public Mono<Void> deleteById(@PathVariable int id)
	{
		return service.delete(id);
	}
	@PutMapping("/update/{id}")
	@CachePut(value="customerCache",key="#id",condition="#id<3")
	public Mono<Customer> updateCustomer(@PathVariable int id,@RequestBody Customer customer) throws InterruptedException, ExecutionException
	{
		return service.update(id,customer);
		 
	}
}

// stores the response in the cache by the name specified in
//the annotation attribute e.g. @Cacheable(“employees”).
