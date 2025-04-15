package com.shreyash.paper_trading.controller;

import com.shreyash.paper_trading.model.UserModel;
import com.shreyash.paper_trading.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public UserModel getUser(){
        return userService.getUser(930788);
    }


}
