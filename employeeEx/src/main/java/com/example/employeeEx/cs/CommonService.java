package com.example.employeeEx.cs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeEx.feignClient.AddressFeignClient;
import com.example.employeeEx.vo.Address;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CommonService {
	@Autowired
	private AddressFeignClient addressFeign;
	int count=0;
	@CircuitBreaker(name="address")
	public Address getAddress(int id)// 
	{
		count++;
		System.out.println("count="+count);
		return addressFeign.getAddress(id); 
	}

}
