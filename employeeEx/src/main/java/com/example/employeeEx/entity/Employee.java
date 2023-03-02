package com.example.employeeEx.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int empId;
	private String name;
	private String department;
	
	
	
	
	public Employee() {}
	
	public Employee(int id, String name, String department) {
		super();
		this.empId = id;
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return empId;
	}
	public void setId(int id) {
		this.empId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}

