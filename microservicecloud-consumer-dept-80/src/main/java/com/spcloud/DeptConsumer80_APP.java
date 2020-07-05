package com.spcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/6/29
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80_APP {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_APP.class, args);
    }
}
