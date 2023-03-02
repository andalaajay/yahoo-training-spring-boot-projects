package com.example.employeeEx.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.employeeEx.vo.Address;



@FeignClient(value="ADDRESS")
public interface AddressFeignClient {
	@GetMapping("/getById/{id}")
	public Address getAddress(@PathVariable int id);

}
