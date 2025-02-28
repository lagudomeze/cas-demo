package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.demo.AuthSupport.userDetail;

@RestController
@RequestMapping("/api/v1/")
public class AuthController {

    @GetMapping("/auth/show_me")
    public String register() {
        return userDetail().toString();
    }

    @GetMapping("/test")
    public String test() {
        return "haha";
    }
}
