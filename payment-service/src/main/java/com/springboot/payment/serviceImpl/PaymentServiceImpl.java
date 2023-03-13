package com.springboot.payment.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.payment.entities.PaymentInfo;
import com.springboot.payment.repository.PaymentRepository;
import com.springboot.payment.service.PaymentService;
@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	PaymentRepository repo;

	@Override
	public String makePayment(PaymentInfo paymentInfo) {
		// TODO Auto-generated method stub
	PaymentInfo info=repo.save(paymentInfo);
		return "payment successfull with id: "+info.getId();
	}

}
