package com.ming.swagger.controller;

import com.ming.swagger.pojo.User;
import com.ming.swagger.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/12/30
 */
@RestController
@RequestMapping("user")
@Api(value = "用户接口")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询所有用户",notes = "查询所有的用户信息")
    @GetMapping("/queryAllUser")
    public String queryAllUser(){
        return userService.queryAllUser();
    }

    @ApiOperation(value = "新增用户",notes = "参数为用户实体")
    @PostMapping ("/addUser")
    public int addUser(@ApiParam(value = "") User user){
        return userService.addUser(user);
    }
}
