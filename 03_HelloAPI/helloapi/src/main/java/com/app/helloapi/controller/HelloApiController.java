package com.app.helloapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {
    
    @GetMapping
    public String helloApi(){
        return "Hello API!\nMi primera API";
    }
    
}
