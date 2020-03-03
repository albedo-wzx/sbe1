package com.albedo.eurekafeignclient;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FeignConfig {
    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default();
    }

    //负载均衡策略选择
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}
