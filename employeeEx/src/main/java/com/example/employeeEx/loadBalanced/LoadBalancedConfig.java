//package com.example.employeeEx.loadBalanced;
//
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
//import org.springframework.context.annotation.Bean;
//
//import feign.Feign;
//
//@LoadBalancerClient(value="ADDRESS")
//public class LoadBalancedConfig {
//	
//	@LoadBalanced
//	@Bean
//	public Feign.Builder feignClient()
//	{
//		return Feign.builder();
//	}
//}
