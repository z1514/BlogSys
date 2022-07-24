package com.example.MyBlog.controller;

import com.example.MyBlog.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MediaTypeController {

    @RequestMapping("/user")
    public User getUser(){
        return new User("zjx",30);
    }
}
