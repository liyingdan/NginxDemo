package com.janet.dao;

import com.janet.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description TODO
 * @Date 2020/4/29
 * @Author Janet
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}