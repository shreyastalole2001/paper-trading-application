package com.shreyash.paper_trading.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class abc {

    @GetMapping("/getUser")
    public String getUser(){
        return "SHREYASH";
    }


}
