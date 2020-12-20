package com.janet.service;

import com.janet.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description TODO
 * @Date 2020/4/29
 * @Author Janet
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}