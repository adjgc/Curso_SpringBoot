package com.app.helloapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {
    
    @GetMapping
    public String helloApi(){
        return "Hello API!\nMi primera API";
    }
    
    @GetMapping("hello/requestparam")
    public String helloRequestParam(@RequestParam String nombre){
        return "Hello " + nombre + ", con RequestParam";
    }
    
    @GetMapping("bye/requestparam")
    public String byeRequestParam(
            @RequestParam String nombre,
            @RequestParam int edad,
            @RequestParam String profesion
    ){
        return "Bye!\nNombre: " + nombre + "\nEdad: " + edad + "\nProfesion: " + profesion;
    }
    
}
