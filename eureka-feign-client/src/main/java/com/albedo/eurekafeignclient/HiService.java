package com.albedo.eurekafeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {
    @Autowired
    EurekaFeignClient eurekaFeignClient;
    public String hi(String name){
        return eurekaFeignClient.sayHi(name);
    }
}
