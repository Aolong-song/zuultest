package com.example.springcloudzuulserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZuulServerApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication2.class, args);
        System.out.println("zuul 第二个服务启动...");
    }
}