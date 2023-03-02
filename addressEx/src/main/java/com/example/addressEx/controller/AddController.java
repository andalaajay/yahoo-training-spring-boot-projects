package com.example.addressEx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.addressEx.entity.Address;
import com.example.addressEx.service.AddressService;

@RestController
public class AddController {
	@Autowired
	private AddressService service;
	Logger logger=LoggerFactory.getLogger(AddController.class);
	@GetMapping("/getById/{id}")
	public Address getAddress(@PathVariable int id)
	{
		//System.out.println(id);
		logger.info("id="+id);
		Address address=service.getById(id);
		return address;
	}
	
	@PostMapping("/save")
	public void createAddress(@RequestBody Address address)
	{
		//System.out.println(address.getCity());
		service.saveAddress(address);
	}

}
