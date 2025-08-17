package com.anush.My.App;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile(){
        System.out.println("I have new Dell one");
    }
}
