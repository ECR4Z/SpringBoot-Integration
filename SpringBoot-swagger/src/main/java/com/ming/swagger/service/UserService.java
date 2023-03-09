package com.ming.swagger.service;

import com.ming.swagger.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/12/30
 */
@Service
public class UserService {
    public String queryAllUser() {
        return "query success!";
    }

    public int addUser(User user) {
        return 1;
    }
}
