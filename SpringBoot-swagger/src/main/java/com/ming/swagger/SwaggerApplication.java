package com.ming.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;


/**
 * @ClassName: SwaggerApplication
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/12/30
 */
@SpringBootApplication
@EnableOpenApi
public class SwaggerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplication.class);
    }
}
