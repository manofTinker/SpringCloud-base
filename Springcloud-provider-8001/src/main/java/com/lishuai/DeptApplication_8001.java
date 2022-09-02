package com.lishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author lishuai
 * @date 2022/7/26
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
//@EnableHystrix

public class DeptApplication_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptApplication_8001.class,args);
    }
}
