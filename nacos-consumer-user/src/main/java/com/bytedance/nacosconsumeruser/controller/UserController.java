package com.bytedance.nacosconsumeruser.controller;

import com.bytedance.nacosconsumeruser.bean.User;
import com.bytedance.nacosconsumeruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    public User getUser(Integer id){
        return userService.getUser(id);
    }
    @GetMapping("/getUserAndMovie")
    public Map<String,Object> getUserAndMovie(Integer id){
        return userService.getUserAndMovie(id);
    }

}
