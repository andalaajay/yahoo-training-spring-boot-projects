package com.practice.productservice;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.practice.productservice.controller.ProductController;
import com.practice.productservice.entity.Customer;
import com.practice.productservice.service.ProductService;
//import com.sun.org.slf4j.internal.Logger;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

//@RunWith(SpringRunner.class)
@WebFluxTest(ProductController.class)
class ProductServiceApplicationTests {

	@Autowired
	private WebTestClient clint;
	
	@MockBean
	private ProductService service;
	
	Logger logger=LoggerFactory.getLogger(ProductServiceApplicationTests.class);
	
	@Test
	public void testSaveEndpoint()
	{
		
//		Product product1=new Product(1, "computer","software related");
//		Mono<Product> product=Mono.just(product1);
		
		Mono<Customer> product=Mono.just(new Customer(1,"compter","hardware product"));
		when(service.save(product)).thenReturn(product);
		Flux<Customer> responseBody=clint.post()
		.uri("/save")
		.body(product,Customer.class)
		.exchange()//exchange method will give headers,response and cookies
		.expectStatus().isOk()
		.returnResult(Customer.class)
		.getResponseBody();
//		
		//With the StepVerifier API, we can define our expectations of published elements 
		//in terms of what elements we expect and what happens when our stream completes.
//		StepVerifier.create(responseBody)
//		.expectSubscription()
//		.expectNextMatches(obj->obj.getName().equals("hardware"))
//		.verifyComplete();
	}
	//
	
	@Test
	public void testGetEndPoint()
	{
		Mono<Customer> product=Mono.just(new Customer(1,"compter","hardware product"));
		when(service.getById(1)).thenReturn(product);
		Flux<Customer> responseProducts=clint.get()
		.uri("/getById/1")
		.exchange()
		.expectStatus().isOk() 
		.returnResult(Customer.class)
		.getResponseBody();
		
		StepVerifier.create(responseProducts)
		.expectSubscription()
		.expectNextMatches(obj->obj.getDescription().equals("hardware product")&&obj.getId()==1)
		.verifyComplete();
	}
	@Test
	public void testGetAllEndPoint()
	{
		
		Flux<Customer> products=Flux.just(new Customer(1,"computer","hardware products")
				,new Customer(2,"electronics","electronic products"));
		//int n=products.count().sub
		when(service.getAll()).thenReturn(products);
		Flux<Customer> responseProducts=
				clint.get()
		        .uri("/getAll")
		        .exchange()
		        .expectStatus().isOk() 
		        .returnResult(Customer.class)
		        .getResponseBody();
		
		
		
		StepVerifier.create(responseProducts)
		.expectSubscription()
		.expectNextMatches(e->e.getDescription().equals("hardware products")&&e.getId()==1)
		.expectNextMatches(e->e.getDescription().equals("electronic products")&&e.getId()==2)
		.verifyComplete();
	}
	
	@Test
	public void deleteApiTest()
	{
		logger.info("test case in  the delete part");
		logger.trace("this is a trace message");
		logger.error("this is errror message");
		logger.warn("this message is in logger");
		when(service.delete(1)).thenReturn(Mono.empty());
		//given(service.delete(1)).willReturn(Mono.empty());
		clint.delete()
		.uri("/delete/1")
		.exchange()
		.expectStatus().isOk();
	}

}
