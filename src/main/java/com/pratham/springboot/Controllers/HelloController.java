package com.pratham.springboot.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.pratham.springboot.Model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {

    @Autowired
    private MessageProperties properties;
    
    @GetMapping(value="/home")
    public String index(Model model) {
       
        return "home";
    }

    @GetMapping(value="/welcome")
    public String conhome(@RequestParam String name,Model model) {
         String message=properties.getGreeting()+name;
         
        model.addAttribute("greetingMessage",message);
        return "welcome";
    }

     @GetMapping("/hello")
    public String hello(Model model) {
        String message="Hello welcome to Spring Boot";
        model.addAttribute("message", message);
        return "hello";
    }

    


}


