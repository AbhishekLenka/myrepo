package com.springboot.payment.service;

import com.springboot.payment.entities.PaymentInfo;

public interface PaymentService {

	String makePayment(PaymentInfo paymentInfo);

}
