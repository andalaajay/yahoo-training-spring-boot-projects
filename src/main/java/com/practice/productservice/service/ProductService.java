package com.practice.productservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.productservice.entity.Customer;
import com.practice.productservice.repo.ProductRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
	
	   public ProductService() {}
	    @Autowired
		private ProductRepository repo;
		
		public Mono<Customer> save(Mono<Customer> product)
		{
			//Mono<Object> pro= product.map(this.repo::insert);
			//here flat map is used because insert method gives the mono of object as return type
			return product.flatMap(this.repo::insert);
			//return product.flatMap(this.repo::save);
		}
		
		public Mono<Customer> getById(int id)
		{
			return this.repo.findById(id);
			
		}
		//one doubt
		public Flux<Customer> getAll()
		{
			return this.repo.findAll();
		}
		
		public Mono<Customer> update(Customer product,int id)
		{
			/*return repo.findById(id)
					.map(product1->product.setId(id)
					.map(this.repo::save));*/
			Mono<Customer> p=repo.findById(id);
			//p.hasElement() != null->check it is mono contains object or null 
			if(p.hasElement() != null)
			{
				product.setId(id);
			}
			Mono<Customer> changedProduct=Mono.just(product);
			return changedProduct;
		}
		
		public Mono<Void> delete(int id)
		{
			return repo.deleteById(id);
		}
		
	

}
