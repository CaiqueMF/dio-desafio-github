package com.teste.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControleler {

    @GetMapping("/")
    public String HelloMessage(){
        return "oi chifrudo teste";
    }
}
