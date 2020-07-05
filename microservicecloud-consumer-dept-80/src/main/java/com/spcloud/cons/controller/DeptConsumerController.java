package com.spcloud.cons.controller;

import com.spcloud.api.entitry.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/6/29
 */
@RestController
public class DeptConsumerController {

    private static final String REST_URL = "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    RestTemplate restTemplate;

    @PostMapping(value = "/consumer/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return restTemplate.postForObject(REST_URL+"/dept/add", dept,Boolean.class);
    }

    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL+"/dept/get/"+id,Dept.class);
    }

    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL+"/dept/list", List.class);
    }
}
