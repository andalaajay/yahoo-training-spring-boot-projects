package com.example.employeeEx.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.employeeEx.cs.CommonService;
import com.example.employeeEx.entity.Employee;
import com.example.employeeEx.feignClient.AddressFeignClient;
import com.example.employeeEx.repo.EmpRepo;
import com.example.employeeEx.vo.Address;
import com.example.employeeEx.vo.EmployeeVo;

import reactor.core.publisher.Mono;


@Service
public class Empservice {
	@Autowired
	private EmpRepo repo;
	@Autowired
	private WebClient webClient;
	@Autowired
	private AddressFeignClient addressFeign;
	
	@Autowired
	private CommonService cm;
	
	public Empservice() {}

	public Employee save(Employee emp) {
		Employee emp1=repo.save(emp);
		return emp1;
	}

	public EmployeeVo getById(int id) {
		//System.out.println(id);
		Optional<Employee> optional = repo.findById(id);
		Employee emp=optional.get();
		
		Address add=cm.getAddress(emp.getId());
		EmployeeVo vo=new EmployeeVo();
		vo.setAdd(add);
		vo.setEmp(emp);
		return vo;
	}
	public void delete(int id)
	{
		repo.deleteById(id);
	}
	
	
}
