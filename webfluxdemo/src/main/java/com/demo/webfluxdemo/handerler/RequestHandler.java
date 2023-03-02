package com.demo.webfluxdemo.handerler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.demo.webfluxdemo.dto.InvalidResponse;
import com.demo.webfluxdemo.dto.Multiply;
import com.demo.webfluxdemo.exception.InputInvalidException;
import com.demo.webfluxdemo.service.ReactiveService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class RequestHandler {
	
	@Autowired
	private ReactiveService reactive;
	
	
	public Mono<ServerResponse> multipleHandler(ServerRequest request)
	{
		int value=Integer.parseInt(request.pathVariable("id"));
		Mono<Integer> result=reactive.square(value);
		return ServerResponse.ok().body(result,Integer.class);
	}
	
	public Mono<ServerResponse> tableHandelr(ServerRequest request)
	{
		int value=Integer.parseInt(request.pathVariable("input"));
		Flux<Integer> result=reactive.table(value);
		return ServerResponse.ok().body(result,Integer.class);
	}
	
	public Mono<ServerResponse> multiplyTwo(ServerRequest request)
	{
		Mono<Multiply> input=request.bodyToMono(Multiply.class);
		//Multiply original=input.block();
		Mono<Integer> result=reactive.multiplyTwo(input);
		return ServerResponse.ok().body(result,Integer.class);
	}
	//post example taking one object and returning another object
	public Mono<ServerResponse> check(ServerRequest request)
	{
		Mono<Multiply> obj=request.bodyToMono(Multiply.class);
		InvalidResponse response=
				new InvalidResponse();
		response.setInput(1233);
		response.setMessage("ajay kuamr");
		response.setRequestNo(123);
		//Multiply original=obj.block();
		//convertsion of class object to mono object
		Mono<InvalidResponse> response1=Mono.just(response);
		return ServerResponse.badRequest().body(response1,InvalidResponse.class);
	}
	
	public Mono<ServerResponse> tableStream(ServerRequest request)
	{
		int inputt=Integer.parseInt(request.pathVariable("input"));
		Flux<Integer> result=reactive.table(inputt);
		return ServerResponse
				.ok()
				.contentType(MediaType.TEXT_EVENT_STREAM)
				.body(result,Integer.class);
	}
	//handling an exception and sending the result as object
	public Mono<ServerResponse> multiply(ServerRequest request)
	{
		int value=Integer.parseInt(request.pathVariable("input"));
		if(value>1 && value<=100)
		{
		Mono<Integer> result=reactive.square(value);
		return ServerResponse.ok().body(result,Integer.class);
		}
		else
		{
			
			InvalidResponse  response=new InvalidResponse();
			response.setInput(value);
			response.setMessage("value should between in the 1  and 100");
			Mono<InvalidResponse> monoresponse=Mono.just(response);
			return ServerResponse
					.badRequest()
					.body(monoresponse,InvalidResponse.class);
			
			//throw new InputInvalidException(value);
		}
	}
	
	
	

}
