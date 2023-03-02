package com.example.employeeEx.vo;

import com.example.employeeEx.entity.Employee;

public class EmployeeVo {
	
	private Employee emp;
	private Address add;
	
	
	public EmployeeVo(Employee emp, Address add) {
		this.emp = emp;
		this.add = add;
	}
	public EmployeeVo() {
		// TODO Auto-generated constructor stub
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	
}
