package com.example.springbootdemo.mydemoapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Time on the server is " +
//                + System.currentTimeMillis();
                LocalDateTime.now();
    }

    @Value("${team.name}")
    private String teamName;


}
