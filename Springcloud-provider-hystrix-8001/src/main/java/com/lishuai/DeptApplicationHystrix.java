package com.lishuai;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

import javax.imageio.spi.RegisterableService;

/**
 * @author lishuai
 * @date 2022/7/28
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableHystrix //开启熔断器
@EnableCircuitBreaker
public class DeptApplicationHystrix {
    public static void main(String[] args) {
        SpringApplication.run(DeptApplicationHystrix.class,args);
    }

    @Bean
    public ServletRegistrationBean hystrixmetricstreamservlet(){

        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        //访问该页面就是监控页面
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        return registrationBean;
    }
}
