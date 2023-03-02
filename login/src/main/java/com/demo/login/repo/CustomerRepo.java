package com.demo.login.repo;



import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.login.Entity.Customer;
@Repository
public interface CustomerRepo extends ReactiveCrudRepository<Customer, Integer> {

    
	

}