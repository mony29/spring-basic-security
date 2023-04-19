package com.example.spring_basic_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping("/test")
    public String testPage(){
        return "hello";
    }
    @GetMapping("/user")
    public String userPage(){
        return "hello from user page";
    }
    @GetMapping("/admin")
    public String adminPage(){
        return "hello from admin page";
    }
    @GetMapping("/admin_user")
    public String adminUserPage(){
        return "hello from admin_user page";
    }
}
