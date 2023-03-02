package com.demo.webfluxdemo.dto;

public class InvalidResponse {
	
	private int requestNo;
	
	private String message;

	private int input;
	
	public InvalidResponse(int requestNo, String message,int input) {
		this.requestNo = requestNo;
		this.message = message;
		this.input=input;
	}

	public InvalidResponse() {
		// TODO Auto-generated constructor stub
	}

	public int getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(int requestNo) {
		this.requestNo = requestNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}
	
}
