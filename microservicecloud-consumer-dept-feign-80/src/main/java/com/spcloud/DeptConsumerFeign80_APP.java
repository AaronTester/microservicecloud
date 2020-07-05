package com.spcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/6/29
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.spcloud"})
public class DeptConsumerFeign80_APP {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign80_APP.class, args);
    }
}
