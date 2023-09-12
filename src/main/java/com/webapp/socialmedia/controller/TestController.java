package com.webapp.socialmedia.controller;

import com.webapp.socialmedia.entity.User;
import com.webapp.socialmedia.service.Implement.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    UserService userService;
    @GetMapping
    public ResponseEntity<String> test1(){
        return ResponseEntity.ok("this is test api");
    }

    @GetMapping
    @RequestMapping("user")
    public ResponseEntity<Object> test2(){
        List<User> users = userService.findAll();

        return ResponseEntity.ok(users);
    }
}
