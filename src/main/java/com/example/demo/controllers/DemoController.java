package com.example.demo.controllers;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/main")
    public User getHello(){
        User u = new User("michal", "36");
        return u;
    }
}
