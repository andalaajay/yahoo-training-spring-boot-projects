package com.example.employeeEx.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeEx.entity.Employee;
@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer> {

}
