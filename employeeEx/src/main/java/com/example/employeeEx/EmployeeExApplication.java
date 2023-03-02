package com.example.employeeEx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
@EnableFeignClients("com.example.employeeEx.feignClient")
@SpringBootApplication
public class EmployeeExApplication {

	@Value("${address.service.url}")
	private String url;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeExApplication.class, args);
	}
	@Bean
	public WebClient webClient()
	{
		WebClient webClient=WebClient.builder().baseUrl(url).build();
		return webClient;
	}

}
