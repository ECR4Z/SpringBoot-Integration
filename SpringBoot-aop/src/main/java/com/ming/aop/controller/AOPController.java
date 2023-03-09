package com.ming.aop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aop")
public class AOPController {

    @GetMapping("/testAop")
    public String testAop(){
        return "aop";
    }
}
