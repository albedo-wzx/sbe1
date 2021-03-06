package com.albedo.eurekaribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    RibbonService service;
    @GetMapping("/hi")
    public String hi(@RequestParam(required=false,defaultValue = "albedo") String name){
        return service.hi(name);
    }
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @RequestMapping("/testRibbon")
    public String testRibbon(){
        ServiceInstance instance = loadBalancerClient.choose("eureka-client");
        return instance.getHost()+":"+instance.getPort();
    }
}
