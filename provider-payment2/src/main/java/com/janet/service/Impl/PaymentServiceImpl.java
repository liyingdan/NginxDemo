package com.janet.service.Impl;

import com.janet.dao.PaymentDao;
import com.janet.entities.Payment;
import com.janet.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Date 2020/4/29
 * @Author Janet
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }


}