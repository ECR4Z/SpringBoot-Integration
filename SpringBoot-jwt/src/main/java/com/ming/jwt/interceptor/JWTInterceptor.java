package com.ming.jwt.interceptor;

import com.alibaba.fastjson2.JSON;
import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName: JWTInterceptor
 * @Description: SpringBoot创建拦截器
 * @Author: ECRZ
 * @Date: 2023/1/11
 */
@Component
@CrossOrigin
public class JWTInterceptor implements HandlerInterceptor  {
    @Value("${SECURITY}")
    private String SECURITY;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取请求方法
        String method = request.getMethod();

        if ("OPTIONS".equals(method)){
            return true;
        }

        String token = request.getHeader("token");
        if (token != null && token != ""){
            try {
                JwtParser jwtParser = Jwts.parser();
                jwtParser.setSigningKey(SECURITY);
                Jws<Claims> claimsJws = jwtParser.parseClaimsJws(token);
                return true;
            }catch (ExpiredJwtException e){
                doResponse(response,"Token已过期，请重新登陆！");
                return false;
            }catch(JwtException e){
                doResponse(response,"Token异常，请重新登陆！");
                return false;
            }
        }
        doResponse(response,"Token不存在，请重新登陆获取！");
        return false;
    }

    public void doResponse(HttpServletResponse response,String info) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");

        PrintWriter writer = response.getWriter();
        ResponseEntity<String> responseEntity=new ResponseEntity<>(info, HttpStatus.NOT_ACCEPTABLE);
        String json = JSON.toJSONString(responseEntity);
        writer.write(json);
        writer.flush();
        writer.close();
    }

}
