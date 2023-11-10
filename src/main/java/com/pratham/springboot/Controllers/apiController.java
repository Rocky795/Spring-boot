package com.pratham.springboot.Controllers;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;

@RestController
public class apiController {
    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody Map<String, String> userData) {
       
        String username = userData.get("username");
        String email = userData.get("email");

       
        String responseMessage = "User created successfully: " +
                "Username: " + username +
                ", Email: " + email;

        return new ResponseEntity<>(responseMessage, HttpStatus.CREATED);
    }

}
