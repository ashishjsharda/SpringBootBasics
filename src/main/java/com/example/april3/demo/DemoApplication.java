package com.example.april3.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class DemoApplication implements CommandLineRunner {

    @Autowired
    RestTemplate restTemplate;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String hello(){
        return "Hello World";
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Implementing Command Line Runner");
    }
}
