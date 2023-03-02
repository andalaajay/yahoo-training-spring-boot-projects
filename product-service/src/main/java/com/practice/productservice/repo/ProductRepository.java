package com.practice.productservice.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.practice.productservice.entity.Customer;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Customer,Integer> {

}
