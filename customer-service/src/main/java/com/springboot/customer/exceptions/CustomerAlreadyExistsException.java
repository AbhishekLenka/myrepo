package com.springboot.customer.exceptions;

public class CustomerAlreadyExistsException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Msg;

	public CustomerAlreadyExistsException(String msg) {
		super();
		Msg = msg;
	}
	
}
