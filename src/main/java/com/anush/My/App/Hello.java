package com.anush.My.App;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/")
    public String greet() {
        return "Hello Anush! Welcome to my own world.....";
    }
}