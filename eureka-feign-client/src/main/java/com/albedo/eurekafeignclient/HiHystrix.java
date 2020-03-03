package com.albedo.eurekafeignclient;

import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements EurekaFeignClient{
    @Override
    public String sayHi(String name) {
        return "Hi,"+name+",sorry,error!";
    }
}
