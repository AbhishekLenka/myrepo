package com.springboot.customer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.customer.dto.PaymentInfo;
import com.springboot.customer.entities.Customer;
import com.springboot.customer.service.CustomerService;
import com.springboot.customer.serviceImpl.PaymentConsumerImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService custService;
	
	@Autowired
	PaymentConsumerImpl pConsumerImpl;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer) {
		
		return new ResponseEntity<>(custService.saveCustomer(customer),null, HttpStatus.CREATED);
	}

	@PostMapping("/pay")
	public ResponseEntity<String> makePayment(@RequestBody PaymentInfo payInfo){
		
		return new ResponseEntity<>(pConsumerImpl.makePayment(payInfo), HttpStatus.CREATED);
	}
	@GetMapping("/getDetails/{name}")
	public ResponseEntity<Customer> getCustomerDetailsByName(@PathVariable String name){
		
		return new ResponseEntity<Customer>(custService.getCustomerDetailsByName(name),HttpStatus.OK);
	}
}
