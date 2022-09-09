package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("HelloWorld")
    public String hello()
    {
        return "welcome to the spring boot application ";
    }

}
