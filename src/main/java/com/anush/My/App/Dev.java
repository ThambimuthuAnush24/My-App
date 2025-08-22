package com.anush.My.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    //Constructor Injection
    // public Dev(Laptop laptop){
    // this.laptop=laotop;
    //}
    @Autowired //Field Injection
    private  Computer comp;
    public void build(){
        comp.compile();
        System.out.println(" I am working on a Awesome project");
    }
}


