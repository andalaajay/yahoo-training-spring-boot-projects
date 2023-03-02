package com.demo.webfluxdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@Data
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
public class Multiply {
	private int number1;
	private int number2;
	
	public Multiply(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}

}
