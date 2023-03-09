package com.ming.jwt.service;

import com.alibaba.fastjson2.JSON;
import com.ming.jwt.pojo.User;
import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: JWTService
 * @Description: JWT 服务类
 * @Author: ECRZ
 * @Date: 2023/1/11
 */
@Service
public class JWTService {
    @Value("${SECURITY}")
    private String SECURITY;

    public String generateToken(){
        User user = new User(1,"张三","123456");
        String js = new String(JSON.toJSONString(user));
        JwtBuilder jwtBuilder = Jwts.builder();

        Map<String , Object> claim = new HashMap<>();

        claim.put("key",js);
        String token = jwtBuilder.setSubject("hello") //设置用户数据
                .setIssuedAt(new Date()) //设置jwt生成时间
                .setId("1") //设置token id为1
                .setClaims(claim)
                .setExpiration(new Date(System.currentTimeMillis() + 50000000)) // 设置token过期时间
                .signWith(SignatureAlgorithm.HS256,SECURITY) //设置加密方式和密钥
                .compact();
        return token;
    }

    public ResponseEntity<User> parseToken(String token){
        if (token!=null && token != ""){
            JwtParser jwtParser= Jwts.parser(); //获取jwt解析器
            jwtParser.setSigningKey(SECURITY);

            try {
                Jws<Claims> claimsJws = jwtParser.parseClaimsJws(token);
                Claims body = claimsJws.getBody();//获取body
                String subject = body.getSubject();//获取body中subject中的值
                String key = body.get("key", String.class);//获取Claims中map的值
                User user = JSON.parseObject(key, User.class);//反序列化user
                return new ResponseEntity<User>(user, HttpStatus.OK);
            }catch (Exception e){
                e.printStackTrace();
                return new ResponseEntity<User>(new User(),HttpStatus.NOT_ACCEPTABLE);
            }
        }
        return new ResponseEntity<User>(new User(),HttpStatus.NOT_ACCEPTABLE);
    }
}
