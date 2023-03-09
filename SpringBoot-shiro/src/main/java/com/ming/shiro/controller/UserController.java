package com.ming.shiro.controller;

import com.ming.shiro.pojo.User;
import com.ming.shiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/12/28
 */
@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/queryByName")
    public User queryById(String name){
        return userService.queryByName(name);
    }

    @GetMapping("/queryAllUser")
    public List<User> queryAllUser(){
        return userService.queryAllUser();
    }

    @GetMapping("/login")
    public String login(String name,String password){
        return userService.login(name,password);
    }
}
