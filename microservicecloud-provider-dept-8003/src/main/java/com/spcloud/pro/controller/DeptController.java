package com.spcloud.pro.controller;

import com.spcloud.api.entitry.Dept;
import com.spcloud.pro.service.DeptService;
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
public class DeptController {

    @Autowired
    DeptService deptService;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }
}
