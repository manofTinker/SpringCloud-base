package com.lishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lishuai
 * @date 2022/7/27
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class DeptApplication_8003 {
    public static void main(String[] args) {
        SpringApplication.run(DeptApplication_8003.class,args);
    }
}
