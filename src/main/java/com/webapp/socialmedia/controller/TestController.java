package com.webapp.socialmedia.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
public class TestController {

    @GetMapping
    private ResponseEntity<?> test(){
        return ResponseEntity.ok("test");
    }

    @GetMapping("/exception")
    private ResponseEntity<?> exception() throws Exception {
        throw new Exception("new exception");
    }
}
