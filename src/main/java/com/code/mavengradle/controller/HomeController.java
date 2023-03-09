package com.code.mavengradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String show(){
        return "Welcome to gradle";
    }


    @GetMapping("/second")
    public String second(){
        return "second branch";
    }   
        
    @GetMapping("/third")
    public String third(){
        return "third branch";

    
}
