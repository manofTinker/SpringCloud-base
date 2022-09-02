package com.lishuai.controller;

import com.lishuai.pojo.Dept;
import com.lishuai.service.DeptService;
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

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/dept/add")
    public boolean DeptAdd(Dept dept){
        return deptService.DeptAdd(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept QueryById(@PathVariable("id") long id){
        return deptService.QueryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> QueryAll(){
        return deptService.QueryAll();
    }

    @GetMapping("/discover")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        System.out.println("discovery->service"+services);

        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        instances.forEach(instance->{
            System.out.println(instance.getHost() + "\t" +
                    instance.getPort() + "\t" +
                    instance.getUri() + "\t" +
                    instance.getServiceId());
        });
        return this.discoveryClient;
    }



}
