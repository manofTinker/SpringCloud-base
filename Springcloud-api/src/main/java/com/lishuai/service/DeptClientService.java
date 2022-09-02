package com.lishuai.service;

import com.lishuai.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author lishuai
 * @date 2022/7/28
 */

/**
 * 负载均衡 feign
 * 请求访问服务提供者的接口信息,请求路径要保持和provider的controller中的path一致才可以
 */
@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientFallBackFactory.class)
public interface DeptClientService {

    @GetMapping("/dept/add")
    public boolean DeptAdd(Dept dept);

    @GetMapping("/dept/get/{id}")
    public Dept QueryById(long id);

    @GetMapping("/dept/list")
    public List<Dept> QueryAll();

}
