package com.example.Spring_sec_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String greet(HttpServletRequest request){
        return "Hello world ";
    }

    @GetMapping("about")
    public String about(HttpServletRequest request){
        return "ritwik" + request.getSession().getId();
    }

    @GetMapping("new")
    public String newHome(HttpServletRequest request){
        return "home " + request.getSession().getId();
    }
}
