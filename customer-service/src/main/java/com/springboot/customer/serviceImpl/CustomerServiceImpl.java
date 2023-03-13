package com.springboot.customer.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.customer.entities.Customer;
import com.springboot.customer.exceptions.CustomerNotFoundException;
import com.springboot.customer.repository.CustomerRepository;
import com.springboot.customer.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepository repo;
Logger logger=LoggerFactory.getLogger(CustomerServiceImpl.class);
	@Override
	public String saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		Customer cust=repo.save(customer);
		return "customer saved with id :"+cust.getId();
	}

	@Override
	public Customer getCustomerDetailsByName(String name) {
		// TODO Auto-generated method stub
		Customer customer =repo.findByName(name);
		if(customer==null) {
			logger.error("GetCustomerDetails called with name:{}",name);
			throw new CustomerNotFoundException(name);
		}
		 return customer;
	}

}
