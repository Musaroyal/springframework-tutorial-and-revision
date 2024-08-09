package com.example.restapi.service;
import com.example.restapi.model.*;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class userService {
    private List<user> users = new ArrayList<>();

    public userService(){
        users.add(new user(1L, "Mavasa Musa", "musa@gmail.com"));
        users.add(new user(4L, "Mavasa Ingrid", "Ingie@gmail.com"));
    }

    public List<user> getAllUsers(){
        return users;
    }

    public user getUserById(Long id){
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public void addUser(user User){
        users.add(User);
    }
}
