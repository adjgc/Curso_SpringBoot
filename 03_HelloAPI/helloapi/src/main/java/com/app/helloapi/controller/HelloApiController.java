package com.app.helloapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {
    
    @GetMapping("/hello")
    public String helloApi(){
        return "Hello API!\nPrimer endpoint";
    }
    
    @GetMapping("/bye")
    public String byeApi(){
        return "Bye API!\nSegundo endpoint";
    }
    
    @GetMapping("/hello/{nombre}")
    public String helloPathVariable(@PathVariable String nombre){
        return "Hello " + nombre + ", con PathVariable!";
    }
    
    @GetMapping("/bye/{nombre}/{edad}/{profesion}")
    public String byePathVariable(
            @PathVariable String nombre,
            @PathVariable int edad,
            @PathVariable String profesion
    ){
        return "Bye!\n" + "Nombre: " + nombre + "\nEdad: " + edad + "\nProfesion: " + profesion;
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
