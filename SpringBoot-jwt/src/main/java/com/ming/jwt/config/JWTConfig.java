package com.ming.jwt.config;

import com.ming.jwt.interceptor.JWTInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: JWTConfig
 * @Description: SpringBoot配置拦截器
 * @Author: ECRZ
 * @Date: 2023/1/11
 */
@Configuration
public class JWTConfig implements WebMvcConfigurer {
    @Autowired
    private JWTInterceptor jwtInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> pathPatterns=new ArrayList<>();
        pathPatterns.add("/jwt/**");

        List<String> excludePathPatterns=new ArrayList<>();
        excludePathPatterns.add("/jwt/generateToken");

        registry.addInterceptor(jwtInterceptor) //添加拦截器
                .addPathPatterns(pathPatterns) //添加拦截url
                .excludePathPatterns(excludePathPatterns); //添加不拦截url
    }
}
