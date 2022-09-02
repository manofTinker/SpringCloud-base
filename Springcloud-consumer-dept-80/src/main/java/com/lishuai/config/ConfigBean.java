package com.lishuai.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lishuai
 * @date 2022/7/26
 */
@Configuration
public class ConfigBean {

    //手动注册bean
    /*
    * IRule
    * RoundRobinRule 轮询
    * RandomRule 随机
    * AvailabilityFilteringRule：会先过滤，跳闸,访问故障的服务，对剩下的进行轮询
    * RetryRule：会先进行轮询读取服务，如果失败，则会在指定时间内重试连接
    * */
    @Bean
    @LoadBalanced //实现Ribbon负载均衡加入RestTemplate
    public RestTemplate GetRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
