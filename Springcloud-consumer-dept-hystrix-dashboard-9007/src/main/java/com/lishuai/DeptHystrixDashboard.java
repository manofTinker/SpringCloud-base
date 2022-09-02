package com.lishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author lishuai
 * @date 2022/7/28
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptHystrixDashboard {
    public static void main(String[] args) {
        SpringApplication.run(DeptHystrixDashboard.class,args);
    }
}
