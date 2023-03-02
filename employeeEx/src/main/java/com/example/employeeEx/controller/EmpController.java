package com.example.employeeEx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeEx.entity.Employee;
import com.example.employeeEx.service.Empservice;
import com.example.employeeEx.vo.EmployeeVo;



@RestController
public class EmpController {
	
	@Autowired
	private Empservice service;
	public EmpController() {}
	Logger logger=LoggerFactory.getLogger(EmpController.class);
	@PostMapping("/save")
	public Employee save(@RequestBody Employee emp)
	{
		Employee emp1=service.save(emp);
		return emp1;
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		service.delete(id);
	}
	@GetMapping("/getBy/{id}")
	public EmployeeVo getById(@PathVariable int id)
	{
		//System.out.println(id);
		EmployeeVo emp=service.getById(id);
		//System.out.println(emp.getAdd());
		logger.info("id="+id);
		return emp;
	} 

}
