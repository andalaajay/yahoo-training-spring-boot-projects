package com.example.addressEx.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addressEx.entity.Address;
import com.example.addressEx.repo.AddressRepo;

@Service
public class AddressService {
	
	
	@Autowired
	private AddressRepo repo;
	public Address getById(int id) {
		Optional<Address> address=repo.findById(id);
		return address.get();
	}
	public void saveAddress(Address address) {
		repo.save(address);
	}
}
