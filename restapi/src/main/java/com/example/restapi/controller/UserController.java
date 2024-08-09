package com.example.restapi.controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.*;
import com.example.restapi.model.*;
import com.example.restapi.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController

public class UserController {
    @Autowired
    private userService userservice;

    @GetMapping("/users")

    public List<user> getAllUsers(){
        return userservice.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public user getUserById(@PathVariable Long id){
        return userservice.getUserById(id);
    }
   
    @PostMapping("/users")
    public user createUser(@RequestBody user User) {
        userservice.addUser(User);
        
        return User;
    }
    
    
}
