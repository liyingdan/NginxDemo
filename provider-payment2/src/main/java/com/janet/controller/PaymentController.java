package com.janet.controller;

import com.janet.entities.CommonResult;
import com.janet.entities.Payment;
import com.janet.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Description TODO
 * @Author Janet
 * @Date 2020-12-20
 */

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果----"+payment);
        if(payment != null)
            return new CommonResult(200,"查询成功，端口号："+serverPort,payment);
        else
            return new CommonResult(444,"没有对应字段，查询ID"+id,null);

    }

    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment){

        int result = paymentService.create(payment);

        log.info("插入结果----"+result);

        if(result > 0)
            return new CommonResult(200,"插入数据成功",result);
        else
            return new CommonResult(444,"插入数据失败",null);

    }


}