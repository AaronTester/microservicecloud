package com.spcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/7/5
 */
@SpringBootApplication
@EnableConfigServer
public class StartingApp_config {
    public static void main(String[] args)
    {
        SpringApplication.run(StartingApp_config.class, args);
    }
}
