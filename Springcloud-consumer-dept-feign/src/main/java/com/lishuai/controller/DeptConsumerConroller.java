package com.lishuai.controller;

import com.lishuai.pojo.Dept;
import com.lishuai.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author lishuai
 * @date 2022/7/26
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptConsumerConroller {

    @Autowired
//    private RestTemplate restTemplate;//提供了多种便捷远程http服务的方法，简单的resutful服务模板
//
//    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    private DeptClientService deptClientService;

    @RequestMapping("/add")
    public boolean add(Dept dept){
        return deptClientService.DeptAdd(dept);
    }


    @RequestMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptClientService.QueryById(id);
    }


    @RequestMapping("/list")
    public List<Dept> list(){
        return deptClientService.QueryAll();
    }
}
