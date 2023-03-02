package com.demo.webfluxdemo.exception;

public class InputInvalidException extends RuntimeException {
	private static String message="number should be in between in the 10 and 20";
	private int input;
	public InputInvalidException(int input) {
		super(message);
		this.input=input;
	}
	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	public String getMessage() {
		return message;
	}
	public static void setMessage(String message) {
		InputInvalidException.message = message;
	}

}
