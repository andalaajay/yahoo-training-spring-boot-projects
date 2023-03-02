package com.example.addressEx.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.addressEx.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer>{

}
