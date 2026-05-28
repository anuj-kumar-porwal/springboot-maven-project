package com.ak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoProjectController {

    @GetMapping("/hello")
    public String getData(){
        return "hello sir";
    }


}
