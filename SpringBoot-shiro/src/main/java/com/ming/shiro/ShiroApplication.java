package com.ming.shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: ShiroApplication
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/12/28
 */
@SpringBootApplication
@MapperScan("com.ming.shiro.dao")
public class ShiroApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShiroApplication.class);
    }
}
