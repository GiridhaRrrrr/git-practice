package com.example.toDo.controller;

import com.example.toDo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private HomeService service;

    @GetMapping("/")
    public String Greet(){
        return service.greet();
    }

}
