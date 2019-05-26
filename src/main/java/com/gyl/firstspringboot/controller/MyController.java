package com.gyl.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot!!!";
    }
    @RequestMapping("sayhello")
    public String sayhello(){
        return "hello world!!!";
    }
}
