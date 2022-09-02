package com.lishuai.controller;

import com.lishuai.pojo.Dept;
import com.lishuai.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lishuai
 * @date 2022/7/26
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "HystrixQuerById")//开启熔断
    public Dept QueryById(@PathVariable("id") long id){
        Dept deptById = deptService.QueryById(id);
        if (deptById == null) {
            throw new RuntimeException("id==>"+id+"不存在该用户，或者信息无法找到~");
        }
        return deptById;
    }

    //熔断
    public Dept HystrixQuerById(@PathVariable("id") long id){
        return new Dept().setDept_id(id)
                .setDept_name("这个id"+id+"没有对应的信息")
                .setDept_source("没有对应的数据库");
    }




}
