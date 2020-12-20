package com.janet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description TODO
 * @Date 2020/4/30
 * @Author Janet
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain.class, args);
    }
}