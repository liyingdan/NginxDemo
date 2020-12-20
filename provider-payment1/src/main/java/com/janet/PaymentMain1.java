package com.janet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description TODO
 * @Author Janet
 * @Date 2020-12-20
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain1 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain1.class, args);
    }
}
