package com.springboot.customer.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springboot.customer.consumer.PaymentConsumer;
import com.springboot.customer.dto.PaymentInfo;

@Service
public class PaymentConsumerImpl {

	@Autowired
	PaymentConsumer pConsumer;

	
	@HystrixCommand(fallbackMethod = "makePaymentFallBack")
	public String makePayment(PaymentInfo payInfo) {
		// TODO Auto-generated method stub
		return pConsumer.makePayment(payInfo);
	}
	
	public String makePaymentFallBack(PaymentInfo info) {
		
		return "payment FallBack called.."+" payment failled..";
	}
}
