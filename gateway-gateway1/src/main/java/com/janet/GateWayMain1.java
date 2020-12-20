package com.janet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Date 2020/5/11
 * @Author Janet
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain1 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain1.class, args);
    }
}
