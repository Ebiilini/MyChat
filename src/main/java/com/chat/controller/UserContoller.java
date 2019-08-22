package com.chat.controller;

import com.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.Request;

import java.io.Serializable;

@RestController
public class UserContoller implements Serializable {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public Long addUser(@RequestParam String username){
        return userService.addUser(username);
        //TODO: сделать аналогичную работу для Chat, Message
    }
}
