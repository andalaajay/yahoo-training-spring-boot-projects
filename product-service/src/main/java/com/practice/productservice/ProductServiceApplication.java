package com.practice.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class ProductServiceApplication {

	public static void main(String[] args) {
		//System.setProperty("os.arch", "x86_64");
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
