package com.springboot.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.payment.entities.PaymentInfo;
@Repository
public interface PaymentRepository extends JpaRepository<PaymentInfo, Integer>{

}
