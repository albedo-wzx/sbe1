package com.albedo.eurekaribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
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
}
