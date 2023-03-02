 package com.demo.webfluxdemo.service;

import java.time.Duration;

import org.springframework.stereotype.Service;

import com.demo.webfluxdemo.dto.Multiply;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ReactiveService {
	
	    //reactive method
		public Mono<Integer> square(int input)
		{
			//Mono<Integer> result=Mono.fromSupplier(()->input*input);
			return Mono.fromSupplier(()->input*input);
		}
		public Flux<Integer> table(int input)
		{
			//Flux<Integer> result=Flux.range(1,10).map(i->i*input);
			
			return Flux.range(1,10)
					.delayElements(Duration.ofSeconds(2))
					 .doOnNext(i->System.out.println(i))
					.map(i->i*input);
			//return result;
		}
		public Mono<Integer> multiplyTwo(Mono<Multiply> input) {
			return input.doOnNext(i->System.out.print(i.getNumber1()))
					.map(obj->obj.getNumber1()*obj.getNumber2());
		}

}
