package com.example.springcloudzuulserver2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @RequestMapping("/hi")
    public String index(@RequestParam String name) {
        return name+",hi!";
    }
}