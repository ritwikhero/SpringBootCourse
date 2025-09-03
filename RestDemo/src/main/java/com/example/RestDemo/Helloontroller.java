package com.example.RestDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloontroller {

    @RequestMapping("/")
    public String greet(){
        return "Docker time";
    }
}
