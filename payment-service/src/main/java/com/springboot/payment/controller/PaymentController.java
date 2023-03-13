package com.springboot.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.payment.entities.PaymentInfo;
import com.springboot.payment.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentService service;

	@PostMapping("/pay")
	public ResponseEntity<String> makePayment(@RequestBody PaymentInfo paymentInfo){
		
		return new ResponseEntity<>(service.makePayment(paymentInfo), HttpStatus.CREATED);
	}
}
