package com.springboot.customer.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.customer.dto.PaymentInfo;

@FeignClient("payment-service")
@Component
public interface PaymentConsumer {
	
	@PostMapping("/payment/pay")
	public String makePayment(@RequestBody PaymentInfo pInfo);

}
