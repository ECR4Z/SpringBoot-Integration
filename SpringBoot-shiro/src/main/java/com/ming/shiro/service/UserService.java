package com.ming.shiro.service;

import com.ming.shiro.dao.UserDao;
import com.ming.shiro.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/12/28
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User queryByName(String name){
        User user = new User();
        user.setUser_name(name);
        return userDao.selectOne(user);
    }

    public List<User> queryAllUser(){
        return userDao.queryAllUser();
    }

    public String login(String name,String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(name, password);
        try {
            subject.login(token);
            return "登陆成功";
        }catch (UnknownAccountException e){
            return "用户不存在";
        }catch (IncorrectCredentialsException e){
            return "密码错误";
        }
    }
}
