package com.example.restapi.model;

public class user {
    private Long id;
    private String name;
    private String email;

    //constructors

    public user(){}


    //overloaded contructors
    public user(Long id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //getters and setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email =email;
    }

}
