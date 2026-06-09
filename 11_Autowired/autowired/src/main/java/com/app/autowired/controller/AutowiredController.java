package com.app.autowired.controller;

import com.app.autowired.model.Posteo;
import com.app.autowired.repository.IPosteoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutowiredController {
    
    @Autowired
    IPosteoRepository posteoRepository;
    
    @GetMapping("/posteos")
    public List<Posteo> consultarTodos(){
        return posteoRepository.consultarTodos();
    }
    
}
