package com.springboot.customer.exceptions;

public class CustomerNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CustomerNotFoundException(String name) {
		super(name);
	}

	
	
	
}
