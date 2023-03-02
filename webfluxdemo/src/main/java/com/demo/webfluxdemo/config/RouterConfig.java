package com.demo.webfluxdemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.demo.webfluxdemo.handerler.RequestHandler;

@Configuration
public class RouterConfig {
	@Autowired
	private RequestHandler handler;
	
	//path based routing says that if path contains the word router1 then align it
	@Bean 
	public RouterFunction<ServerResponse> mainRoute()
	{
		return RouterFunctions
				.route()
				.path("router", this::allRoutes)
				.build();
	}
	
	
	
	
	
	
	//@Bean
	public RouterFunction<ServerResponse> allRoutes()
	{
		return RouterFunctions
				.route()
				.GET("square/{id}",handler::multipleHandler)
				.GET("tablefor/{input}",handler::tableHandelr)
				.GET("multipleofTwo",handler::multiplyTwo)
				.GET("table/stream/{input}",handler::tableStream)
				.GET("square/exception/{input}",handler::multiply)
				.POST("sendObject",handler::check)
				.build();
	}
}
