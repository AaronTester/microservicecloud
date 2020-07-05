package com.spcloud.cons.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spcloud.api.entitry.Dept;
import com.spcloud.api.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    DeptClientService deptClientService;

    @PostMapping(value = "/consumer/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptClientService.add(dept);
    }

    @GetMapping(value = "/consumer/dept/get/{id}")
   // @HystrixCommand(fallbackMethod = "processHytrixGet")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptClientService.get(id);
        return dept;
    }

    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return deptClientService.list();
    }

    public Dept processHytrixGet(@PathVariable("id") Long id) {
        return new Dept().setDeptId(id).setDeptName("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                .setData_source("no this database in MySQL");
    }
}
