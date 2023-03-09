package com.ming.jwt.controller;

import com.ming.jwt.pojo.User;
import com.ming.jwt.service.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: JWTController
 * @Description: JWT接口定义
 * @Author: ECRZ
 * @Date: 2023/1/11
 */
@RestController
@CrossOrigin
@RequestMapping("jwt")
public class JWTController {
    @Autowired
    private JWTService jwtService;

    @GetMapping("/generateToken")
    public String generateToken(){
        return jwtService.generateToken();
    }

    @GetMapping("/parseToken")
    public ResponseEntity<User> parseToken(@RequestParam(value = "token") String token){
        return jwtService.parseToken(token);
    }

}
