package com.albedo.eurekafeignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value = "eureka-client",configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface EurekaFeignClient {
    @GetMapping(value = "/hi")
    String sayHi(@RequestParam String name);
}
