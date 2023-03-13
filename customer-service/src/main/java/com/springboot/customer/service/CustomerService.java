package com.springboot.customer.service;

import com.springboot.customer.entities.Customer;

public interface CustomerService {

	String saveCustomer(Customer customer);

	Customer getCustomerDetailsByName(String name);

}
