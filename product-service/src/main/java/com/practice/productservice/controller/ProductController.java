package com.practice.productservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.productservice.entity.Customer;
import com.practice.productservice.service.ProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductController {
	
	Logger logger=LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductService service;
	
	public ProductController(){}	
	
	@GetMapping("getAll")
	public Flux<Customer> getAll() {
		return service.getAll();
	}

	@GetMapping("getById/{id}")
	public Mono<Customer> getAll(@PathVariable int id) {
		//logger.info("id="+id);
		return service.getById(id);
	}

	@PostMapping("save")
	public Mono<Customer> save(@RequestBody Mono<Customer> product) {
		return service.save(product);
	}

	@DeleteMapping("delete/{id}")
	public Mono<Void> delete(@PathVariable int id) {
		return service.delete(id);
	}

	@PutMapping("put/{id}")
	public Mono<Customer> update(@PathVariable int id, @RequestBody Customer product) {
		return service.update(product, id);
	}

}
